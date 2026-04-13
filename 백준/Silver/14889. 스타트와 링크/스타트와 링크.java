import java.util.*;

public class Main{
    public static int status[][];
    public static int min=101;
    public static boolean visited[];
    public static ArrayList<Integer> startTeam=new ArrayList<>();
    public static ArrayList<Integer> linkTeam=new ArrayList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        status=new int[n][n];
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                status[i][j]=s.nextInt();
            }
            
        }
        dfs(0,0,n/2);
        

        
        System.out.print(min);
    }
    public static void dfs(int start,int depth,int end){
        if(depth==end){
            startTeam=new ArrayList<>();
            linkTeam=new ArrayList<>();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) startTeam.add(i);
                else linkTeam.add(i);
            }
            calculate();
            return;
        }

        for(int i=start;i<status[0].length;i++){

            if(!visited[i]){
                visited[i] =true;
                dfs(i+1,depth+1,end);
                visited[i]=false;
            }
        }
     
    }
    public static void calculate(){
        int startSum=0;
        int linkSum=0;
        
        
        for(int i=0;i<startTeam.size();i++){
            for(int j=i+1;j<startTeam.size();j++){
                int a=startTeam.get(i);
                int b=startTeam.get(j);
                int sum=status[a][b]+status[b][a];
                startSum+=sum;
                
            }
        }
        
        for(int i=0;i<linkTeam.size();i++){
            for(int j=i+1;j<linkTeam.size();j++){
                int a=linkTeam.get(i);
                int b=linkTeam.get(j);
                int sum=status[a][b]+status[b][a];
                linkSum+=sum;
            }
        }
        
        int minus=startSum>linkSum?startSum-linkSum:linkSum-startSum;
        min=minus<min?minus:min;
    }
     
}