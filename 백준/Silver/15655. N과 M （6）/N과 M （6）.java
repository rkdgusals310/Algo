import java.util.*;

public class Main{
    public static int num[];
    public static boolean visited[];
    public static void main(String args[]){
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
        dfs(0,1,n,m,arr);
    }
    public static void dfs(int depth,int start,int n,int m,int arr[]){
        if(depth==m){
            for(int i=0;i<m;i++){
                System.out.print(num[i]+" ");
                
            }System.out.println();
            return;
        }
        
        for(int i=start;i<=n;i++){
           
                num[depth]=arr[i];
                dfs(depth+1,i+1,n,m,arr);
            
        }
    }
}