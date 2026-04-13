import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n+1];
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
            dp[i]=arr[i];
        }
        for(int i=2;i<n+1;i++){
            int num=dp[i-1]+arr[i];
            dp[i]=num>dp[i]?num:dp[i];
        }
        int max=dp[1];
        for(int i=2;i<n+1;i++){
            max=dp[i]>max?dp[i]:max;
        }
        System.out.print(max);
    }
}