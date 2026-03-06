import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException {
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int tiling[]=new int[1001];
        tiling[1]=1;
        tiling[2]=2;
        for(int i=3;i<n+1;i++){
            tiling[i]=(tiling[i-1]+tiling[i-2])%10007;
        }
        bw.write(tiling[n]+" ");
        bw.close();
        br.close();
    }
}