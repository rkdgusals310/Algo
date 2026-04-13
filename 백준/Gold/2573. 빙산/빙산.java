import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] A, melt;
    static boolean[][] vis;
    static final int[] dx = {1, -1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        int year = 0;
        while (true) {
            int comps = countComponents();
            if (comps >= 2) { System.out.println(year); return; }
            if (comps == 0) { System.out.println(0); return; }
            meltOneYear();
            year++;
        }
    }

    static int countComponents() {
        vis = new boolean[N][M];
        int comps = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] > 0 && !vis[i][j]) {
                    bfs(i, j);
                    comps++;
                }
            }
        }
        return comps;
    }

    static void bfs(int sy, int sx) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        vis[sy][sx] = true;
        q.add(new int[]{sy, sx});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0], x = cur[1];
            for (int d = 0; d < 4; d++) {
                int ny = y + dy[d], nx = x + dx[d];
                if (ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
                if (A[ny][nx] > 0 && !vis[ny][nx]) {
                    vis[ny][nx] = true;
                    q.add(new int[]{ny, nx});
                }
            }
        }
    }

    static void meltOneYear() {
        melt = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0) continue;
                int c = 0;
                for (int d = 0; d < 4; d++) {
                    int ny = i + dy[d], nx = j + dx[d];
                    if (ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
                    if (A[ny][nx] == 0) c++;
                }
                melt[i][j] = c;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0) continue;
                A[i][j] = Math.max(0, A[i][j] - melt[i][j]);
            }
        }
    }
}
