import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        int f=s.nextInt();
        
        if((a*e-b*d)!=0&&b!=0){
            int x=(c*e-b*f)/(a*e-b*d);
            int y=(c-a*x)/b;
        
            System.out.print(x+" "+y);
        }
        else{
            int x=c/a;
            int y=(f-d*x)/e;
            System.out.print(x+" "+y);
        }
        
    }
}