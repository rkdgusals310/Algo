import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        System.out.print(sieveOfEratosthenes(n,k));
    }
    public static int sieveOfEratosthenes(int n,int k){
        boolean isPrime[]=new boolean[n+1];
       
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        int cnt=0;
        int stop=0;
        int removeNum=0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                for(int j=i;j<=n;j+=i){
                    if(isPrime[j]){
                        isPrime[j]=false;
                        cnt++;
                        if(cnt==k){removeNum=j;stop=1;break;}
                    }
                    
                    
                }
            }if(stop==1){break;}
            
        }return removeNum;
    }
}