import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        // 나무 위치를 정렬
        Arrays.sort(arr);

        // 인접 나무 사이의 간격을 계산
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = arr[i + 1] - arr[i];
        }

        // 모든 간격의 GCD를 계산
        int gcd = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcd = gcd(gcd, gaps[i]);
        }

        // 추가할 나무의 수를 계산
        int result = 0;
        for (int gap : gaps) {
            result += (gap / gcd - 1);
        }

        System.out.println(result);
    }

    // GCD를 구하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
