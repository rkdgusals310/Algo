import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s=new Scanner(System.in);

        float n1=s.nextFloat();
        float n2=s.nextFloat();
        float n3=s.nextFloat();

        System.out.printf("%.3f \n",Math.round(n1*1000)/1000.0);
        System.out.printf("%.3f \n",Math.round(n2*1000)/1000.0);
        System.out.printf("%.3f",Math.round(n3*1000)/1000.0);
    }
}