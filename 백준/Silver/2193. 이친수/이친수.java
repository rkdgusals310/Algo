import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        long dp[][]=new long[n+1][2];
        dp[0][0]=0;
        dp[0][1]=1;
        dp[1][0]=1;
        dp[1][1]=0;
        for(int i=2;i<n;i++){
            dp[i][0]=dp[i-1][0]+dp[i-1][1];
            dp[i][1]=dp[i-1][0];    
        }

        System.out.println(dp[n-1][0]+dp[n-1][1]);
    }
}