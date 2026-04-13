import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 + 공백 출력 (마지막 별 뒤에는 공백 없음)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j != i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
