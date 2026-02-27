import java.util.*;

public class Main{
    public static StringBuilder sb=new StringBuilder();
    public static int arr[];
    public static boolean visited[];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        arr=new int[m];
        visited=new boolean[n];

        dfs(n,m,0);
        System.out.print(sb);
    }
    
    public static void dfs(int n,int m,int depth){
        if(depth==m){
            for(int i=0;i<m;i++){
                sb.append(arr[i]).append(" ");
            }sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            
            if(!visited[i]){
                visited[i]=true;
                arr[depth]=i+1;
                dfs(n,m,depth+1);
                visited[i]=false;
            }   
        }
    }
}
