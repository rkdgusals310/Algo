import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        int limit = (int)Math.sqrt(n) + 1;
        boolean prime[]=new boolean[limit+1];
        primeTool(prime);
        
        for(int i=2;i<prime.length;i++){
            while(n%i==0&&prime[i]){
                n=n/i;
                sb.append(i+"\n"); 
            }
        }
        if (n > 1) sb.append(n).append("\n");
        System.out.print(sb);
        
        
    }
    public static void primeTool(boolean prime[]){
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i<prime.length;i++){
            if(prime[i]){
                for(int j=i*i;j<prime.length;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
}