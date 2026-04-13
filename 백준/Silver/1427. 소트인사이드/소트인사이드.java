
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;


//https://80000coding.oopy.io/21cb57a3-681b-404d-a4ac-8ab0e7289bc0 sort 내림차순
//https://makemethink.tistory.com/170    콘솔입력
//https://makemethink.tistory.com/172      콘솔출력
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String str="";
        str=br.readLine();
        String arr[]=str.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]);
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}