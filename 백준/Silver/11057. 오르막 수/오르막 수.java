import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        long dp[][]=new long[n+1][10];
        Arrays.fill(dp[1],1);
        for(int i=2;i<n+1;i++){
            for(int j=0;j<10;j++){
                for(int k=j;k>=0;k--){
                    dp[i][j]+=dp[i-1][k]%10007;
                }
            }
        }
        long sum=0;
        for(int i=0;i<10;i++){
            sum+=dp[n][i];
        }
        System.out.print(sum%10007);
    }
}