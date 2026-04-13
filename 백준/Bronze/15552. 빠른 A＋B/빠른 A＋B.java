import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//입력
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));//출력
        StringBuilder sb=new StringBuilder();
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String str=br.readLine();
            String str2[]=str.split(" ");
            sb.append(Integer.parseInt(str2[0])+Integer.parseInt(str2[1])).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}