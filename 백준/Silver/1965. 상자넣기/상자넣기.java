import java.util.*;

public class Main{
    public static int dp[];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n+1];
        dp=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.fill(dp,1);
        int max=dp[1];
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
                }
            }
            
            max=Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}