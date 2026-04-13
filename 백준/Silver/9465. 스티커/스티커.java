import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int test=s.nextInt();
        for(int t=0;t<test;t++){
            int n=s.nextInt();
            int sticker[][]=new int[2][n];
            int dp[][]=new int[2][n];
            for(int i=0;i<2;i++){
                for(int j=0;j<n;j++){
                    sticker[i][j]=s.nextInt();
                }
            }
            dp[0][0]=sticker[0][0];
            dp[1][0]=sticker[1][0];
            if(n>1){
                dp[0][1]=dp[1][0]+sticker[0][1];
                dp[1][1]=dp[0][0]+sticker[1][1];
            }
            
            
            
            for(int j=2;j<n;j++){
                dp[1][j]=dp[0][j-2]+sticker[1][j]>dp[0][j-1]+sticker[1][j]?dp[0][j-2]+sticker[1][j]:dp[0][j-1]+sticker[1][j];
                dp[0][j]=dp[1][j-2]+sticker[0][j]>dp[1][j-1]+sticker[0][j]?dp[1][j-2]+sticker[0][j]:dp[1][j-1]+sticker[0][j];
 
            }
            
            int max=dp[0][n-1]>dp[1][n-1]?dp[0][n-1]:dp[1][n-1];
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}