import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=0;i<num;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(a+b);
        }
    }
}