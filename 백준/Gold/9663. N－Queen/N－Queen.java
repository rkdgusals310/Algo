import java.util.*;

public class Main{
    public static boolean visited[];
    public static boolean visitedPlus[];
    public static boolean visitedMinus[];
    public static int chessBoard[][];
    public static int cnt=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        chessBoard=new int[n][n];
        visited=new boolean[n];
        visitedPlus=new boolean[2*n-1];
        visitedMinus=new boolean[2*n-1];
        
        // n개의 퀸이 충돌하지 않는 경우는 각행마다 한개씩 존재
        dfs(0);
        System.out.print(cnt);
    }
    public static void dfs(int depth){
        if(depth==visited.length){
            cnt++;
            return;
        }
        for(int i=0;i<visited.length;i++){
            if(!visited[i]&&!visitedPlus[depth+i]&&!visitedMinus[depth-i+(visited.length-1)]){
                visited[i]=true;
                visitedPlus[depth+i]=true;
                visitedMinus[depth-i+(visited.length-1)]=true;
                dfs(depth+1);
                visited[i]=false;
                visitedPlus[depth+i]=false;
                visitedMinus[depth-i+(visited.length-1)]=false;
            }
        }
    }
   
}