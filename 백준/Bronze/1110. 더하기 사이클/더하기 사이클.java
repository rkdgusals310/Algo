import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(cycle(n));
    }
    public static int cycle(int n){
        int start=n;
        int cnt=0;
        while(true){
            int a=n/10;
            int b=n%10;
            int c=a+b;
            cnt++;
            n=b*10+c%10;
            if(n==start){return cnt;}
        }
    }
}