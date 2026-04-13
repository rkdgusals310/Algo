import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= 3 && dp[i - 3] != -1) {
                dp[i] = dp[i - 3] + 1;
            }
            if (i >= 5 && dp[i - 5] != -1) {
                if (dp[i] == -1 || dp[i] > dp[i - 5] + 1) {
                    dp[i] = dp[i - 5] + 1;
                }
            }
        }

        System.out.println(dp[n]);
    }
}
