import java.util.*;


public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();

        int dp[]=new int[n+3];
        dp[1]=0;
        dp[2]=1;
        dp[3]=1;
        
        for(int i=4;i<=n;i++){
          dp[i]=dp[i-1];
          
            if(i%2==0){
                dp[i]=dp[i/2]>dp[i]?dp[i]:dp[i/2];
            }
            if(i%3==0){
                dp[i]=dp[i/3]>dp[i]?dp[i]:dp[i/3];
            }
            dp[i]+=1;

        }
            
        System.out.print(dp[n]);
    }
}