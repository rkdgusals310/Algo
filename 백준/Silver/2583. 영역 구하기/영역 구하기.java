import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static boolean[][] block, vis;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static int bfs(int sr, int sc) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sr, sc});
        vis[sr][sc] = true;
        int area = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int nr = cur[0] + dr[k], nc = cur[1] + dc[k];
                if (0 <= nr && nr < M && 0 <= nc && nc < N && !vis[nr][nc] && !block[nr][nc]) {
                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                    area++;
                }
            }
        }
        return area;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        block = new boolean[M][N];
        vis = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int r = y1; r < y2; r++) {
                for (int c = x1; c < x2; c++) {
                    block[r][c] = true;
                }
            }
        }
        ArrayList<Integer> areas = new ArrayList<>();
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                if (!vis[r][c] && !block[r][c]) areas.add(bfs(r, c));
            }
        }
        Collections.sort(areas);
        StringBuilder sb = new StringBuilder();
        sb.append(areas.size()).append('\n');
        for (int i = 0; i < areas.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(areas.get(i));
        }
        System.out.println(sb.toString());
    }
}
