import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n+1];
        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        for(int i=1;i<n+1;i++){
            arr[i]=s.nextInt();
        }
        for(int i=2;i<=n;i++){
            for(int j=i;j>0;j--){
                if(arr[i]>arr[j]){
                    dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
                }
            }
        }
        int max=dp[1];
        for(int i=2;i<=n;i++){
            max=max>dp[i]?max:dp[i];
        }        
        System.out.print(max);
    }
}