import java.util.Scanner;

public class Main {
    static char[][] map;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        map = new char[n][n];

        drawStar(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void drawStar(int x, int y, int size, boolean blank) {
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    map[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            map[x][y] = '*';
            return;
        }

        int newSize = size / 3;
        int count = 0;
        for (int i = x; i < x + size; i += newSize) {
            for (int j = y; j < y + size; j += newSize) {
                count++;
                if (count == 5) {
                    drawStar(i, j, newSize, true);  // 가운데는 공백
                } else {
                    drawStar(i, j, newSize, false);
                }
            }
        }
    }
}
