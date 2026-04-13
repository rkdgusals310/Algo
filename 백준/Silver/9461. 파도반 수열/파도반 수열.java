import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=Integer.parseInt(br.readLine());
        long tri[]=new long[101];
        Arrays.fill(tri,-1);
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            waves(num,tri);
            bw.write(tri[num]+"\n");
        }
       
        bw.close();
        br.close();
    
    }
    public static void waves(int n,long tri[]){
        if(tri[n]!=-1){return;}
        else if(n>0&&n<=3){tri[n]=1;return;}
        else if(n<=5){tri[n]=2;return;}
        waves(n-1,tri);
        waves(n-5,tri);
       
        tri[n]=tri[n-5]+tri[n-1];
    }
}