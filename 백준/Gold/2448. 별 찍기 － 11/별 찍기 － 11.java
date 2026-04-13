import java.io.*;

public class Main {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new char[n][2 * n - 1];

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                map[i][j] = ' ';
            }
        }

        draw(n, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (char[] line : map) {
            sb.append(line).append("\n");
        }
        System.out.print(sb);
    }

    static void draw(int size, int y, int x) {
        if (size == 3) {
            map[y][x] = '*';
            map[y + 1][x - 1] = '*';
            map[y + 1][x + 1] = '*';
            for (int i = -2; i <= 2; i++) {
                map[y + 2][x + i] = '*';
            }
            return;
        }

        int half = size / 2;
        draw(half, y, x); // 위 삼각형
        draw(half, y + half, x - half); // 왼쪽 아래 삼각형
        draw(half, y + half, x + half); // 오른쪽 아래 삼각형
    }
}
