import java.io.*;
import java.util.*;

public class Main {
    public static int sum[] = new int[4];
    public static int paper[][];
    public static boolean visited[][];
    public static int max = 0;
    public static int n, m;

    public static int dx[] = {0, 0, -1, 1};
    public static int dy[] = {-1, 1, 0, 0};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        paper = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        exce();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(j, i, 0);
                visited[i][j] = false;
            }
        }

        System.out.print(max);
    }

    public static void dfs(int x, int y, int depth) {
        if (depth == 4) {
            int sumTotal = sum[0] + sum[1] + sum[2] + sum[3];
            max = Math.max(max, sumTotal);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if (!visited[ny][nx]) {
                    visited[ny][nx] = true;
                    sum[depth] = paper[ny][nx];
                    dfs(nx, ny, depth + 1);
                    visited[ny][nx] = false;
                }
            }
        }
    }

    public static void exce() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int center = paper[i][j];
                int neighborSum = 0;
                int cnt = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 4; k++) {
                    int nx = j + dx[k];
                    int ny = i + dy[k];

                    if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                        int value = paper[ny][nx];
                        neighborSum += value;
                        cnt++;
                        min = Math.min(min, value);
                    }
                }

                if (cnt == 3) {
                    max = Math.max(max, center + neighborSum);
                } else if (cnt == 4) {
                    max = Math.max(max, center + neighborSum - min);
                }
            }
        }
    }
}