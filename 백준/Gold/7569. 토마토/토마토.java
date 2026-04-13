import java.util.*;

public class Main {
    public static boolean[][][] visited;
    public static int day = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<int[]> queue = new LinkedList<>();

        int m = s.nextInt();
        int n = s.nextInt();
        int h = s.nextInt();

        int[][][] box = new int[h][n][m];
        visited = new boolean[h][n][m];

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    box[k][i][j] = s.nextInt();
                    if (box[k][i][j] == 1) {
                        queue.offer(new int[]{k, i, j, 0}); 
                        visited[k][i][j] = true;
                    }
                }
            }
        }

        bfs(queue, box);

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (box[k][i][j] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(day);
    }

    public static void bfs(Queue<int[]> q, int[][][] box) {
        int[] dx = {1, -1, 0, 0, 0, 0};
        int[] dy = {0, 0, 1, -1, 0, 0};
        int[] dz = {0, 0, 0, 0, 1, -1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int z = cur[0];
            int y = cur[1];
            int x = cur[2];
            int d = cur[3];
            day = Math.max(day, d);

            for (int i = 0; i < 6; i++) {
                int nz = z + dz[i];
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nz >= 0 && nz < box.length &&
                    ny >= 0 && ny < box[0].length &&
                    nx >= 0 && nx < box[0][0].length) {

                    if (box[nz][ny][nx] == 0 && !visited[nz][ny][nx]) {
                        box[nz][ny][nx] = 1;
                        visited[nz][ny][nx] = true;
                        q.offer(new int[]{nz, ny, nx, d + 1});
                    }
                }
            }
        }
    }
}
