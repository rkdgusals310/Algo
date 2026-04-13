import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int dp[]=new int[n+1];
        dp[1]=0;
        if(n>1){
            dp[2]=1;
        }
        if(n>2){
            dp[2]=1;
            dp[3]=0;
        }
        
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-3]+dp[i-1];
            if(dp[i]==0){dp[i]=1;}
            if(dp[i]==2){dp[i]=0;}
        }
        String str="SK";
        if(dp[n]==1){str="CY";}
        System.out.println(str);
    }
  /*  1 3 3
    3 1 3
    // 0 = s
    // 1 = c
    dp[n]=dp[n-3]+dp[n-1]    
    1    2    3    4    5    6    7    8    9    10
    s    c    s    c    s    c    s*/
}