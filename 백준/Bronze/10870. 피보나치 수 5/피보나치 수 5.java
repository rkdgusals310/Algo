import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=f(n);
        System.out.println(num);
    }
    static int f(int n){
        if(n==0){
            return 0; 
        }
        else if(n==1){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}