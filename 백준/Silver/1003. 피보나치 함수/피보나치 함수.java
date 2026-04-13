import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int fibo[][]=new int[41][2];
        for(int fi[]:fibo){Arrays.fill(fi,-1);}
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            fiboTools(num,fibo);
            bw.write(fibo[num][0]+" "+fibo[num][1]+"\n");
            
        }
        bw.flush();
       
    }
    public static void fiboTools(int n,int fibo[][]){
        if(fibo[n][0]!=-1&&fibo[n][1]!=-1){return;}
        else if(n==1){
            fibo[n][0]=0;
            fibo[n][1]=1;
            return;
        }
        else if(n==0){
            fibo[n][0]=1;
            fibo[n][1]=0;
            return;
        }
        
        fiboTools(n-1,fibo);
        fiboTools(n-2,fibo);
        
        fibo[n][0]=fibo[n-2][0]+fibo[n-1][0];
        fibo[n][1]=fibo[n-2][1]+fibo[n-1][1];
    }
}