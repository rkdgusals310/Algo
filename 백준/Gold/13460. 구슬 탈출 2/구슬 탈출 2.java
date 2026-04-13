import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;
    static int rx, ry, bx, by;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class State {
        int rx, ry, bx, by, d;
        State(int rx, int ry, int bx, int by, int d) {
            this.rx = rx; this.ry = ry; this.bx = bx; this.by = by; this.d = d;
        }
    }

    static class MoveResult {
        int x, y, cnt;
        boolean inHole;
        MoveResult(int x, int y, int cnt, boolean inHole) {
            this.x = x; this.y = y; this.cnt = cnt; this.inHole = inHole;
        }
    }

    static MoveResult roll(int x, int y, int dir) {
        int cx = x, cy = y, c = 0;
        while (true) {
            int nx = cx + dx[dir], ny = cy + dy[dir];
            if (board[nx][ny] == '#') break;
            cx = nx; cy = ny; c++;
            if (board[cx][cy] == 'O') return new MoveResult(cx, cy, c, true);
        }
        return new MoveResult(cx, cy, c, false);
    }

    static int bfs() {
        boolean[][][][] vis = new boolean[N][M][N][M];
        Queue<State> q = new ArrayDeque<>();
        q.offer(new State(rx, ry, bx, by, 0));
        vis[rx][ry][bx][by] = true;

        while (!q.isEmpty()) {
            State cur = q.poll();
            if (cur.d >= 10) continue;

            for (int dir = 0; dir < 4; dir++) {
                MoveResult r = roll(cur.rx, cur.ry, dir);
                MoveResult b = roll(cur.bx, cur.by, dir);

                if (b.inHole) continue;
                if (r.inHole) return cur.d + 1;

                if (r.x == b.x && r.y == b.y) {
                    if (r.cnt > b.cnt) {
                        r.x -= dx[dir];
                        r.y -= dy[dir];
                    } else {
                        b.x -= dx[dir];
                        b.y -= dy[dir];
                    }
                }

                if (!vis[r.x][r.y][b.x][b.y]) {
                    vis[r.x][r.y][b.x][b.y] = true;
                    q.offer(new State(r.x, r.y, b.x, b.y, cur.d + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                char c = line.charAt(j);
                board[i][j] = c;
                if (c == 'R') { rx = i; ry = j; board[i][j] = '.'; }
                else if (c == 'B') { bx = i; by = j; board[i][j] = '.'; }
            }
        }
        System.out.println(bfs());
    }
}
