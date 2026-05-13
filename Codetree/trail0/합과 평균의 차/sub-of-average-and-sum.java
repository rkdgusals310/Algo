import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        System.out.println(a+b+c);
        System.out.println((a+b+c)/3);
        System.out.println(a+b+c-(a+b+c)/3);
    }
}