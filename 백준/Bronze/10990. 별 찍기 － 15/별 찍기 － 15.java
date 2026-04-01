import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLine(n, 1);
    }

    // i번째 줄 출력 재귀
    public static void printLine(int n, int i) {
        if (i > n) return;

        printSpace(n - i);
        System.out.print("*");

        if (i > 1) {
            printSpace(2 * i - 3);
            System.out.print("*");
        }

        System.out.println();
        printLine(n, i + 1);
    }

    // 공백 출력 재귀
    public static void printSpace(int count) {
        if (count <= 0) return;
        System.out.print(" ");
        printSpace(count - 1);
    }
}
