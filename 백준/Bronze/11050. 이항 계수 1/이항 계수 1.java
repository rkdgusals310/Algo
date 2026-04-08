import java.util.*;

public class Main{
    public static int arr[];
    public static int cnt=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        arr=new int[n];
        dfs(n,m,0,0);
        System.out.print(cnt);
        
    }
    public static void dfs(int n,int m,int start,int depth){
        if(depth==m){cnt++;return;}
        
        for(int i=start;i<n;i++){
                dfs(n,m,i+1,depth+1);

        }
    }
}