import java.util.*;

public class Main {
    static int N, M;
    static int[][] office;
    static int minBlind = Integer.MAX_VALUE;
    static List<CCTV> cctvs = new ArrayList<>();

    static int[] dx = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};

    static class CCTV {
        int x, y, type;
        CCTV(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        office = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                office[i][j] = sc.nextInt();
                if (office[i][j] >= 1 && office[i][j] <= 5) {
                    cctvs.add(new CCTV(i, j, office[i][j]));
                }
            }
        }

        dfs(0, office);
        System.out.println(minBlind);
    }

    static void dfs(int idx, int[][] map) {
        if (idx == cctvs.size()) {
            minBlind = Math.min(minBlind, countBlind(map));
            return;
        }

        CCTV cctv = cctvs.get(idx);
        int type = cctv.type;

        for (int[][] dirs : getDirections(type)) {
            int[][] newMap = copy(map);
            for (int[] dir : dirs) {
                watch(newMap, cctv.x, cctv.y, dir[0]);
            }
            dfs(idx + 1, newMap);
        }
    }

    static void watch(int[][] map, int x, int y, int dir) {
        int nx = x + dx[dir];
        int ny = y + dy[dir];
        while (0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny] != 6) {
            if (map[nx][ny] == 0) map[nx][ny] = -1;
            nx += dx[dir];
            ny += dy[dir];
        }
    }

    static List<int[][]> getDirections(int type) {
        List<int[][]> result = new ArrayList<>();
        if (type == 1) {
            for (int d = 0; d < 4; d++)
                result.add(new int[][]{{d}});
        } else if (type == 2) {
            result.add(new int[][]{{0}, {2}});
            result.add(new int[][]{{1}, {3}});
        } else if (type == 3) {
            result.add(new int[][]{{0}, {1}});
            result.add(new int[][]{{1}, {2}});
            result.add(new int[][]{{2}, {3}});
            result.add(new int[][]{{3}, {0}});
        } else if (type == 4) {
            result.add(new int[][]{{0}, {1}, {2}});
            result.add(new int[][]{{1}, {2}, {3}});
            result.add(new int[][]{{2}, {3}, {0}});
            result.add(new int[][]{{3}, {0}, {1}});
        } else if (type == 5) {
            result.add(new int[][]{{0}, {1}, {2}, {3}});
        }
        return result;
    }

    static int[][] copy(int[][] map) {
        int[][] newMap = new int[N][M];
        for (int i = 0; i < N; i++)
            newMap[i] = map[i].clone();
        return newMap;
    }

    static int countBlind(int[][] map) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}
