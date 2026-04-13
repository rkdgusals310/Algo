import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();//n은 동생의 수
        int m=s.nextInt();//m은 수빈이 위치
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            arr[i]=m>num?m-num:num-m;
        }
        int result=arr[0];
        for(int i=0;i<n;i++){
            result=gcd(result,arr[i]);
        }
        
        System.out.print(result);
        
    }
    public static int gcd(int a,int b){
        if(a%b==0){return b;}
        return gcd(b,a%b);
    }
}