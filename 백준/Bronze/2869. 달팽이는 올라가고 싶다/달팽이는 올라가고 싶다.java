import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int day = (V - B - 1) / (A - B) + 1; // 올라가는 데 필요한 총 일수

        System.out.println(day);
    }
}
