import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        long dp[]=new long [n+1];
        Arrays.fill(dp,-1);
        fibo(n,dp);
        System.out.print(dp[n]);
    }
    public static long fibo(int n,long []dp){
        if(dp[n]!=-1){return dp[n];}
        if(n==0){
            dp[0]=0;
            return 0;
        }
        else if(n==1){dp[1]=1;return 1;}
        fibo(n-1,dp);
        fibo(n-2,dp);
        
        return dp[n]=dp[n-1]+dp[n-2];
    }
}