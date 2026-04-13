import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int dp[]=new int[n+2];
        dp[1]=1;
        dp[2]=3;
        for(int i=3;i<n+1;i++){
            dp[i]=(dp[i-1]+dp[i-2]*2)%10007;
        }
        System.out.println(dp[n]);
    }
}