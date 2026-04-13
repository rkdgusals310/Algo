import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] budget = new int[N];
        int maxRequest = 0;

        for (int i = 0; i < N; i++) {
            budget[i] = sc.nextInt();
            if (budget[i] > maxRequest) {
                maxRequest = budget[i];
            }
        }

        int M = sc.nextInt();

        int low = 0;
        int high = maxRequest;
        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long sum = 0;

            for (int b : budget) {
                sum += Math.min(b, mid);
            }

            if (sum <= M) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
