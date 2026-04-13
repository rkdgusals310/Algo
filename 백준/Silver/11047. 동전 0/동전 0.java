import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int num[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            num[i]=s.nextInt(); 
        }
        for(int i=n-1;i>=0;i--){
            if(k/num[i]>0){
                cnt+=k/num[i];
                k=k%num[i];
            }
        }
        System.out.print(cnt);
        
    }
}