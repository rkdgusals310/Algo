import java.util.*;

public class Main{
    public static boolean visited[];
    public static int num[];
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[]=new int[n+1];
        visited=new boolean[n+1];
        num=new int[m];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        dfs(0,n,m,arr);
    }
    public static void dfs(int depth,int n,int m,int arr[]){
        if(depth==m){
            for(int i=0;i<m;i++){
                System.out.print(num[i]+" ");
            }System.out.println();
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                num[depth]=arr[i];
                dfs(depth+1,n,m,arr);    
                visited[i]=false;
            }
        }
        

    }
}