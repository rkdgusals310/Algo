import java.io.*;
import java.util.*;

public class Main {
    static int L;
    static int[][] dist;
    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {-1,1,-2,2,-2,2,-1,1};

    static int bfs(int sx, int sy, int ex, int ey) {
        if (sx == ex && sy == ey) return 0;
        for (int i = 0; i < L; i++) Arrays.fill(dist[i], -1);
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy});
        dist[sx][sy] = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            int nd = dist[x][y] + 1;
            for (int k = 0; k < 8; k++) {
                int nx = x + dx[k], ny = y + dy[k];
                if (0 <= nx && nx < L && 0 <= ny && ny < L && dist[nx][ny] == -1) {
                    dist[nx][ny] = nd;
                    if (nx == ex && ny == ey) return nd;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            L = Integer.parseInt(br.readLine().trim());
            dist = new int[L][L];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());
            sb.append(bfs(sx, sy, ex, ey)).append('\n');
        }
        System.out.print(sb.toString());
    }
}
