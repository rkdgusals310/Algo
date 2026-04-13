import java.util.Scanner;
public class Main{
        public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt(); 
        int a=n2/100;
        int b=(n2%100)/10;
        int c=(n2%100)%10;
        System.out.println(n1*c);
        System.out.println(n1*b);
        System.out.println(n1*a);
       
        System.out.println(n1*n2);
         
    }
}