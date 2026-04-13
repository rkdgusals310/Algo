import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int dp[]=new int[n+1];
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(arr[j]>arr[i]){
                    dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
                }
            }
            if(dp[i]==0)dp[i]=1;
        }
        
        int max=-1;
        for(int i=1;i<=n;i++){
            max=max>dp[i]?max:dp[i];
        }

        System.out.print(max);
    }
}