import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        BitSet prime=new BitSet(1_000_001);
        prime.set(2,1_000_001);
        primeTool(prime);
        List<Integer> primeList=new ArrayList<>();
        for(int i=0;i<prime.length();i++){
            if(prime.get(i))primeList.add(i);
        }
        
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0)break;
            int len=Collections.binarySearch(primeList,n);
            int left=0;
            int right=len>=0?len:-len-2;
            
            String str="Goldbach's conjecture is wrong.";
            while(left<=right){
                int sum=primeList.get(left)+primeList.get(right);
                if(sum==n){
                    str=n+" = "+primeList.get(left)+" + "+primeList.get(right);
                    break;
                }
                else if(sum<n){left++;}
                else{right--;}  
            }
            bw.write(str+"\n");
        }
        bw.close();
        br.close();
    }
    
    
    
    public static void primeTool(BitSet prime){
        for(int i=2;i*i<prime.length();i++){
            if(prime.get(i)){
                for(int j=i*i;j<prime.length();j+=i){
                    prime.clear(j);
                }
            }
        }
    }
}