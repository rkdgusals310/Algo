import java.util.*;

public class Main{
    public static int num[];
    public static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[]=new int[n+1];
        num=new int[m];
        
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        dfs(0,n,m,arr);
        System.out.println(sb);
    }
    
    public static void dfs(int depth,int n,int m,int arr[]){
        if(depth==m){
            for(int i=0;i<m;i++){
                sb.append(num[i]).append(" ");
            }sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++){
            num[depth]=arr[i];
            dfs(depth+1,n,m,arr);
        }
    }

}