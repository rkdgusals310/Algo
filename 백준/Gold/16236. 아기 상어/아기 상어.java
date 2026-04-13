import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[][] ocean;
    static int sx, sy;
    static int size = 2, eaten = 0;
    static int time = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        ocean = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                ocean[i][j] = Integer.parseInt(st.nextToken());
                if (ocean[i][j] == 9) {
                    sx = i; sy = j;
                    ocean[i][j] = 0;
                }
            }
        }

        while (true) {
            int[] target = bfs(sx, sy);
            if (target == null) break;
            time += target[2];
            sx = target[0];
            sy = target[1];
            ocean[sx][sy] = 0;
            eaten++;
            if (eaten == size) {
                size++;
                eaten = 0;
            }
        }
        System.out.println(time);
    }

    static int[] bfs(int x, int y) {
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y, 0});
        visited[x][y] = true;

        int minDist = Integer.MAX_VALUE;
        int tx = -1, ty = -1;

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0], cy = cur[1], cd = cur[2];
            if (cd > minDist) continue;
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                int nd = cd + 1;
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (visited[nx][ny]) continue;
                if (ocean[nx][ny] > size) continue;
                visited[nx][ny] = true;
                if (ocean[nx][ny] != 0 && ocean[nx][ny] < size) {
                    if (nd < minDist) {
                        minDist = nd;
                        tx = nx; ty = ny;
                    } else if (nd == minDist) {
                        if (nx < tx || (nx == tx && ny < ty)) {
                            tx = nx; ty = ny;
                        }
                    }
                }
                if (nd <= minDist) q.offer(new int[]{nx, ny, nd});
            }
        }
        if (tx == -1) return null;
        return new int[]{tx, ty, minDist};
    }
}
