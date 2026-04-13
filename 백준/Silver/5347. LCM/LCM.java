import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            long a = s.nextLong();
            long b = s.nextLong();
            System.out.println(lcm(a, b));
        }
    }


    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
