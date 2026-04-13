import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static int[][] copy;
    static int maxSafe = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0);
        System.out.println(maxSafe);
    }

    // 벽 3개 세우기
    static void dfs(int depth) {
        if (depth == 3) {
            spreadVirus();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;  
                    dfs(depth + 1);
                    map[i][j] = 0;  
                }
            }
        }
    }

   
    static void spreadVirus() {
        copy = new int[n][m];
        for (int i = 0; i < n; i++) copy[i] = map[i].clone();

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 2) q.add(new int[]{i, j});
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (copy[nx][ny] == 0) {
                        copy[nx][ny] = 2;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

        countSafe();
    }

   
    static void countSafe() {
        int safe = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 0) safe++;
            }
        }
        maxSafe = Math.max(maxSafe, safe);
    }
}
