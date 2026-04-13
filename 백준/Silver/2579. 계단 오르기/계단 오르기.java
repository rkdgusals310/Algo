import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n + 1];
        int[][] dp = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            arr[i] = s.nextInt();
        }

        dp[1][0] = arr[1];
        dp[1][1] = 0;

        if (n >= 2) {
            dp[2][0] = arr[2];
            dp[2][1] = arr[1] + arr[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 2][1]) + arr[i];
            dp[i][1] = dp[i - 1][0] + arr[i];
        }

        System.out.println(Math.max(dp[n][0], dp[n][1]));
    }
}
