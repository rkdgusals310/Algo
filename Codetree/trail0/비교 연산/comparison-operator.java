import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();

        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;


        if(a>=b)one=1;
        if(a>b)two=1;
        if(b>=a)three=1;
        if(b>a)four=1;
        if(a==b)five=1;
        if(a!=b)six=1;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}