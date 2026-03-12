import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int num=s.nextInt();
        System.out.print(str.charAt(num-1));
    }
}