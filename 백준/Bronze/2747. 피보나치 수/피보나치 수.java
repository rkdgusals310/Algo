import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int dp[]=new int[n+1];
        System.out.println(fibo(n,dp));
        
    }
    public static int fibo(int n,int dp[]){
        if(dp[n]!=0){return dp[n];}
        if(n==0)return dp[n]=0;
        if(n==1)return dp[n]=1;
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}