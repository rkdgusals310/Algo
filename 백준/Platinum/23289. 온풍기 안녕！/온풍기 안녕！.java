import java.util.*;

public class Main {
    static int R, C, K;
    static int[][] temp;
    static boolean[][][] wall;
    static List<Heater> heaters = new ArrayList<>();
    static List<int[]> checks = new ArrayList<>();

    static final int RIGHT = 0;
    static final int LEFT = 1;
    static final int UP = 2;
    static final int DOWN = 3;

    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};

    static class Heater {
        int r, c, dir;
        Heater(int r, int c, int dir) {
            this.r = r;
            this.c = c;
            this.dir = dir;
        }
    }

    static class Node {
        int r, c, power;
        Node(int r, int c, int power) {
            this.r = r;
            this.c = c;
            this.power = power;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        R = s.nextInt();
        C = s.nextInt();
        K = s.nextInt();

        temp = new int[R][C];
        wall = new boolean[R][C][4];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int v = s.nextInt();
                if (v >= 1 && v <= 4) {
                    heaters.add(new Heater(i, j, convertDir(v)));
                } else if (v == 5) {
                    checks.add(new int[]{i, j});
                }
            }
        }

        int W = s.nextInt();
        for (int i = 0; i < W; i++) {
            int x = s.nextInt() - 1;
            int y = s.nextInt() - 1;
            int t = s.nextInt();

            if (t == 0) {
                wall[x][y][UP] = true;
                wall[x - 1][y][DOWN] = true;
            } else {
                wall[x][y][RIGHT] = true;
                wall[x][y + 1][LEFT] = true;
            }
        }

        int chocolate = 0;

        while (true) {
            blowAllHeaters();
            controlTemperature();
            decreaseOuter();
            chocolate++;

            if (allCheckCellsWarm()) {
                System.out.println(chocolate);
                return;
            }

            if (chocolate > 100) {
                System.out.println(101);
                return;
            }
        }
    }

    static int convertDir(int v) {
        if (v == 1) return RIGHT;
        if (v == 2) return LEFT;
        if (v == 3) return UP;
        return DOWN;
    }

    static void blowAllHeaters() {
        for (Heater h : heaters) {
            blow(h);
        }
    }

    static void blow(Heater h) {
        int sr = h.r + dr[h.dir];
        int sc = h.c + dc[h.dir];

        if (!inRange(sr, sc)) return;

        boolean[][] visited = new boolean[R][C];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(sr, sc, 5));
        visited[sr][sc] = true;
        temp[sr][sc] += 5;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (cur.power == 1) continue;

            List<int[]> nexts = getNextPositions(cur.r, cur.c, h.dir);

            for (int[] nxt : nexts) {
                int nr = nxt[0];
                int nc = nxt[1];

                if (!inRange(nr, nc) || visited[nr][nc]) continue;

                visited[nr][nc] = true;
                temp[nr][nc] += cur.power - 1;
                q.offer(new Node(nr, nc, cur.power - 1));
            }
        }
    }

    static List<int[]> getNextPositions(int r, int c, int dir) {
        List<int[]> list = new ArrayList<>(3);

        if (dir == RIGHT) {
            if (canMoveRightUp(r, c)) list.add(new int[]{r - 1, c + 1});
            if (canMoveStraight(r, c, RIGHT)) list.add(new int[]{r, c + 1});
            if (canMoveRightDown(r, c)) list.add(new int[]{r + 1, c + 1});
        } else if (dir == LEFT) {
            if (canMoveLeftUp(r, c)) list.add(new int[]{r - 1, c - 1});
            if (canMoveStraight(r, c, LEFT)) list.add(new int[]{r, c - 1});
            if (canMoveLeftDown(r, c)) list.add(new int[]{r + 1, c - 1});
        } else if (dir == UP) {
            if (canMoveUpLeft(r, c)) list.add(new int[]{r - 1, c - 1});
            if (canMoveStraight(r, c, UP)) list.add(new int[]{r - 1, c});
            if (canMoveUpRight(r, c)) list.add(new int[]{r - 1, c + 1});
        } else {
            if (canMoveDownLeft(r, c)) list.add(new int[]{r + 1, c - 1});
            if (canMoveStraight(r, c, DOWN)) list.add(new int[]{r + 1, c});
            if (canMoveDownRight(r, c)) list.add(new int[]{r + 1, c + 1});
        }

        return list;
    }

    static boolean canMoveStraight(int r, int c, int dir) {
        int nr = r + dr[dir];
        int nc = c + dc[dir];
        if (!inRange(nr, nc)) return false;
        return !wall[r][c][dir];
    }

    static boolean canMoveRightUp(int r, int c) {
        if (!inRange(r - 1, c) || !inRange(r - 1, c + 1)) return false;
        if (wall[r][c][UP]) return false;
        if (wall[r - 1][c][RIGHT]) return false;
        return true;
    }

    static boolean canMoveRightDown(int r, int c) {
        if (!inRange(r + 1, c) || !inRange(r + 1, c + 1)) return false;
        if (wall[r][c][DOWN]) return false;
        if (wall[r + 1][c][RIGHT]) return false;
        return true;
    }

    static boolean canMoveLeftUp(int r, int c) {
        if (!inRange(r - 1, c) || !inRange(r - 1, c - 1)) return false;
        if (wall[r][c][UP]) return false;
        if (wall[r - 1][c][LEFT]) return false;
        return true;
    }

    static boolean canMoveLeftDown(int r, int c) {
        if (!inRange(r + 1, c) || !inRange(r + 1, c - 1)) return false;
        if (wall[r][c][DOWN]) return false;
        if (wall[r + 1][c][LEFT]) return false;
        return true;
    }

    static boolean canMoveUpLeft(int r, int c) {
        if (!inRange(r, c - 1) || !inRange(r - 1, c - 1)) return false;
        if (wall[r][c][LEFT]) return false;
        if (wall[r][c - 1][UP]) return false;
        return true;
    }

    static boolean canMoveUpRight(int r, int c) {
        if (!inRange(r, c + 1) || !inRange(r - 1, c + 1)) return false;
        if (wall[r][c][RIGHT]) return false;
        if (wall[r][c + 1][UP]) return false;
        return true;
    }

    static boolean canMoveDownLeft(int r, int c) {
        if (!inRange(r, c - 1) || !inRange(r + 1, c - 1)) return false;
        if (wall[r][c][LEFT]) return false;
        if (wall[r][c - 1][DOWN]) return false;
        return true;
    }

    static boolean canMoveDownRight(int r, int c) {
        if (!inRange(r, c + 1) || !inRange(r + 1, c + 1)) return false;
        if (wall[r][c][RIGHT]) return false;
        if (wall[r][c + 1][DOWN]) return false;
        return true;
    }

    static void controlTemperature() {
        int[][] diff = new int[R][C];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (c + 1 < C && !wall[r][c][RIGHT]) {
                    adjust(r, c, r, c + 1, diff);
                }
                if (r + 1 < R && !wall[r][c][DOWN]) {
                    adjust(r, c, r + 1, c, diff);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[i][j] += diff[i][j];
            }
        }
    }

    static void adjust(int r1, int c1, int r2, int c2, int[][] diff) {
        int gap = Math.abs(temp[r1][c1] - temp[r2][c2]) / 4;
        if (gap == 0) return;

        if (temp[r1][c1] > temp[r2][c2]) {
            diff[r1][c1] -= gap;
            diff[r2][c2] += gap;
        } else if (temp[r2][c2] > temp[r1][c1]) {
            diff[r2][c2] -= gap;
            diff[r1][c1] += gap;
        }
    }

    static void decreaseOuter() {
        for (int c = 0; c < C; c++) {
            if (temp[0][c] > 0) temp[0][c]--;
            if (temp[R - 1][c] > 0) temp[R - 1][c]--;
        }

        for (int r = 1; r < R - 1; r++) {
            if (temp[r][0] > 0) temp[r][0]--;
            if (temp[r][C - 1] > 0) temp[r][C - 1]--;
        }
    }

    static boolean allCheckCellsWarm() {
        for (int[] cell : checks) {
            if (temp[cell[0]][cell[1]] < K) {
                return false;
            }
        }
        return true;
    }

    static boolean inRange(int r, int c) {
        return r >= 0 && r < R && c >= 0 && c < C;
    }
}