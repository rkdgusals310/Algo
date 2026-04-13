import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        
        int n=Integer.parseInt(br.readLine());
        String []inputA=br.readLine().split(" ");
        
        for(int i=0;i<n;i++){
           a=a.multiply(new BigInteger(inputA[i]));
        }
        
        int m=Integer.parseInt(br.readLine());
        String []inputB=br.readLine().split(" ");
        
        for(int i=0;i<m;i++){
           b=b.multiply(new BigInteger(inputB[i]));
        }

        BigInteger gcdNum=a.gcd(b);
        String str=gcdNum.toString();
        if(str.length()>=10){str=str.substring(str.length()-9);}
        System.out.print(str);

        
    }
}