import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int dp[]=new int[11];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        
        int num[]=new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
            if(max<num[i]){max=num[i];}
        }
        for(int i=4;i<=max;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(int i=0;i<n;i++){
            bw.write(dp[num[i]]+"\n");
        }
        bw.close();
        br.close();
  
    }
}