import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 위쪽 삼각형
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i));
        }

        // 아래쪽 삼각형
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(i));
        }
    }
}
