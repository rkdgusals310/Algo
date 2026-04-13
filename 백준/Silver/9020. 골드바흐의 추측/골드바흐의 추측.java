import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        boolean prime[]=new boolean[10000+1];
        primeTool(prime);

        for(int i=0;i<n;i++){
            int num=s.nextInt();
            int right=num/2;
            int left=num/2;
            
           while(right>0&&left<=num){
               if(prime[right]&&prime[left]){break;}
               right--;
               left++;
           }sb.append(right+" "+(left)+"\n");
        }
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
