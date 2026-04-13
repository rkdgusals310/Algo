import java.io.*;
import java.util.*;

public class Main {
    static int N, ans;
    static int[] s, w;

    static void dfs(int idx, int broken) {
        if (idx == N) {
            ans = Math.max(ans, broken);
            return;
        }
        if (s[idx] <= 0 || broken == N - 1) {
            dfs(idx + 1, broken);
            return;
        }
        boolean hit = false;
        for (int j = 0; j < N; j++) {
            if (j == idx || s[j] <= 0) continue;
            hit = true;
            int bs = 0;
            s[idx] -= w[j];
            s[j] -= w[idx];
            if (s[idx] <= 0) bs++;
            if (s[j] <= 0) bs++;
            dfs(idx + 1, broken + bs);
            if (s[idx] <= 0) bs--;
            if (s[j] <= 0) bs--;
            s[idx] += w[j];
            s[j] += w[idx];
        }
        if (!hit) dfs(idx + 1, broken);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        s = new int[N];
        w = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            s[i] = Integer.parseInt(st.nextToken());
            w[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        System.out.println(ans);
    }
}
