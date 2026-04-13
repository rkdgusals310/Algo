import java.util.*;

public class Main {
    public static boolean visited[][];
    public static int map[][];
    public static int cnt = 0;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        visited = new boolean[n][m];
        map = new int[n][m];
        int y = s.nextInt();
        int x = s.nextInt();
        int d = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = s.nextInt();
            }
        }

        dfs(y, x, d, 0);

        
        System.out.print(cnt);
    }

    public static void dfs(int y, int x, int d, int nsew) {
        if (map[y][x] == 1) return;

       if (!visited[y][x]) {
            visited[y][x] = true;
            map[y][x] = 2;
            cnt++;
        }

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        if (nsew == 4) {
            int backY = y;
            int backX = x;

            switch (d) {
                case 0: backY += 1; break; 
                case 1: backX -= 1; break; 
                case 2: backY -= 1; break; 
                case 3: backX += 1; break; 
            }

            if (backX < 0 || backY < 0 || backX >= map[0].length || backY >= map.length || map[backY][backX] == 1) return;

            y = backY;
            x = backX;
            nsew = 0;
        }

        int count = 0;

        while (count != 4) {
            d = (d + 3) % 4;
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && ny >= 0 && nx < map[0].length && ny < map.length) {
                if (map[ny][nx] == 0 && !visited[ny][nx]) {
                    dfs(ny, nx, d, 0);
                    return;
                }
            }
            count++;
            nsew++;
        }

        dfs(y, x, d, nsew);
    }
}
