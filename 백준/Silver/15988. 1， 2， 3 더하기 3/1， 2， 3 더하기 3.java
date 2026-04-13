import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        long dp[]=new long[1_000_001];
        int num[]=new int[n];
        dp[1]=1;dp[2]=2;dp[3]=4;
        int max=-1;
        for(int j=0;j<n;j++){
            num[j]=s.nextInt();
            if(num[j]>max){max=num[j];}
            
        }
        for(int i=4;i<max+1;i++){
                dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1_000_000_009L;
        }
        
        for(int j=0;j<n;j++){

            System.out.println(dp[num[j]]);
        }

    }
}