import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long[][] dp = new long[n + 1][10];
        int MOD = 1_000_000_000;


        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }


        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > 0) dp[i][j] += dp[i - 1][j - 1];
                if (j < 9) dp[i][j] += dp[i - 1][j + 1];
                dp[i][j] %= MOD;
            }
        }

        long sum = 0;
        for (int j = 0; j <= 9; j++) {
            sum = (sum + dp[n][j]) % MOD;
        }

        System.out.println(sum);
    }
}
