import java.util.*;

public class Main{
    static int arr[];
    static boolean visited[];
    static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        arr=new int[m];
        visited=new boolean[n];
        dfs(n,m,0,0);
        System.out.print(sb);
    }
    public static void dfs(int n,int m,int depth,int num){
        if(depth==m){
            for(int i=0;i<m;i++){
                sb.append(arr[i]).append(" ");
            }sb.append("\n");
            
            return;
        }

        // 중복이 불가능하게하면 다쓴 수는 방문처리를 해주어야함
        // 현재 코드는 백트래킹하면서 방문처리를 다시 돌림
        for(int i=num;i<n;i++){
            if(!visited[i]){
                arr[depth]=i+1;
                visited[i]=true;
                dfs(n,m,depth+1,i+1);
                visited[i]=false;
                
            }
            
        }
    }
}