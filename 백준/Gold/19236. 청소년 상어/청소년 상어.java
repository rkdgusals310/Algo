import java.util.*;
public class Main {
    static int[][] copyMap(int[][] src) {
    int[][] dst = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.arraycopy(src[i], 0, dst[i], 0, 4);
        }
        return dst;
    }

    static List<int[]> copyFish(List<int[]> src) {
        List<int[]> dst = new LinkedList<>();
        for (int i = 0; i < src.size(); i++) {
            int[] f = src.get(i);
            // null 방지용
            if (f == null) dst.add(new int[]{0, 0, 0});
            else dst.add(new int[]{f[0], f[1], f[2]});
        }
        return dst;
    }

    public static List < int[] > fishN = new LinkedList < > ();
    public static int map[][] = new int[4][4];
    public static int loc = 0;
    public static int sx = 0;
    public static int sy = 0;
    public static int sdir = 0;
    public static boolean visited[][] = new boolean[4][4];
    public static boolean alive[] = new boolean[17];
    public static int maxFish = 0;
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Arrays.fill(alive, true);
        alive[0] = false;
        
        for (int i = 0; i <= 16; i++) {
            fishN.add(new int[] {0,0,0});
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                map[i][j] = s.nextInt();
                int dir = s.nextInt();
                fishN.set(map[i][j], new int[] {i,j,dir});
            }
        }
        shark(sx, sy, 0);
        System.out.print(maxFish);
    }
    public static void shark(int x, int y, int cnt) {
        cnt += map[x][y];
        loc = map[x][y];
        sdir = fishN.get(loc)[2];
        alive[loc] = false;
        if (!(sx == x && sy == y)) map[sx][sy] = 0;
        sx = x;
        sy = y;
        map[x][y] = -1;
        moveFish(); // 물고기 대이동
         
        dfs(0, cnt);
    }
    public static void dfs(int depth, int count) {
        if (depth == 1) {
            int xyz[] = fishN.get(loc);
            if (map[xyz[0]][xyz[1]] > 0 && alive[map[xyz[0]][xyz[1]]]) {
                int[][] mapB = copyMap(map);
                List<int[]> fishB = copyFish(fishN);
                boolean[] aliveB = Arrays.copyOf(alive, alive.length);
                int bx = sx, by = sy, bdir = sdir, bloc = loc;

                shark(xyz[0], xyz[1], count);

                map = mapB;
                fishN = fishB;
                alive = aliveB;
                sx = bx; sy = by; sdir = bdir; loc = bloc;
            } else {
                maxFish = Math.max(maxFish, count);
            }
            return;
        }

        int dx[] = {0,-1,-1,0,1,1,1,0,-1};
        int dy[] = {0,0,-1,-1,-1,0,1,1,1};
        int nx = sx;
        int ny = sy;

        boolean moved = false;

        while (true) {
            nx += dx[sdir];
            ny += dy[sdir];
            if (nx >= 0 && ny >= 0 && nx < 4 && ny < 4) {
                if (map[nx][ny] > 0 && alive[map[nx][ny]]) {
                    int temp = loc;
                    loc = map[nx][ny];

                    int[][] mapB = copyMap(map);
                    List<int[]> fishB = copyFish(fishN);
                    boolean[] aliveB = Arrays.copyOf(alive, alive.length);
                    int bx = sx, by = sy, bdir = sdir, bloc = loc;

                    dfs(depth + 1, count);

                    loc = temp;
                    map = mapB;
                    fishN = fishB;
                    alive = aliveB;
                    sx = bx; sy = by; sdir = bdir; loc = bloc;

                    moved = true;
                }
            } else {
                break;
            }
        }

        if (!moved) {
            maxFish = Math.max(maxFish, count);
        }

    }
    public static void moveFish() {
        for (int i = 1; i <= 16; i++) {
            int x = fishN.get(i)[0];
            int y = fishN.get(i)[1];
            int z = fishN.get(i)[2];
            int dx[] = {0,-1,-1,0,1,1,1,0,-1};
            int dy[] = {0,0,-1,-1,-1,0,1,1,1};
            int cnt = 0;
            if (!alive[i]) continue;
            while (cnt < 8) {
                int nx = dx[z] + x;
                int ny = dy[z] + y;
                if (nx >= 0 && ny >= 0 && nx < 4 && ny < 4 && map[nx][ny] != -1) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = i;
                        map[x][y] = 0;
                        fishN.set(i, new int[] {nx,ny,z});
                    } else {
                        int temp = map[nx][ny];
                        map[nx][ny] = i;
                        map[x][y] = temp;
                        fishN.set(i, new int[] {nx,ny,z});
                        fishN.set(temp, new int[] {x,y,fishN.get(temp)[2]});
                    }
                    break;
                }
                else {
                    cnt++;
                    z = z % 8 + 1;
                }
            }
        }
  }
}