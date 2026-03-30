// 순열 문제인데 중복가능하다. 
import java.util.*;

public class Main{
    public static int arr[];
    public static StringBuilder sb=new StringBuilder();
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        
        arr=new int[m];
        
        dfs(n,m,0);
        System.out.print(sb);
    }
    public static void dfs(int n,int m,int depth){
        if(depth==m){
            for(int i=0;i<depth;i++){
                sb.append(arr[i]).append(" ");
            }sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            arr[depth]=i+1;
            dfs(n,m,depth+1);
        }
        
    }
}