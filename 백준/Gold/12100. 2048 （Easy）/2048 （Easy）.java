// BOJ 12100 - 2048 (Easy)
import java.io.*;
import java.util.*;

public class Main {
    static int N, ans = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine().trim());
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }
        dfs(board, 0);
        System.out.println(ans);
    }

    static void dfs(int[][] b, int depth) {
        ans = Math.max(ans, getMax(b));
        if (depth == 5) return;
        for (int dir = 0; dir < 4; dir++) {
            int[][] next = moveOnce(b, dir);
            if (!same(b, next)) dfs(next, depth + 1);
        }
    }

    // dir: 0=UP, 1=DOWN, 2=LEFT, 3=RIGHT
    static int[][] moveOnce(int[][] src, int dir) {
        int[][] a = deepCopy(src);
        if (dir == 0) { // UP
            for (int c = 0; c < N; c++) {
                int[] col = getCol(a, c);
                setCol(a, c, processLine(col, false));
            }
        } else if (dir == 1) { // DOWN
            for (int c = 0; c < N; c++) {
                int[] col = getCol(a, c);
                setCol(a, c, processLine(col, true));
            }
        } else if (dir == 2) { // LEFT
            for (int r = 0; r < N; r++) a[r] = processLine(a[r], false);
        } else { // RIGHT
            for (int r = 0; r < N; r++) a[r] = processLine(a[r], true);
        }
        return a;
    }

    // line을 왼쪽 기준으로: reverse=false면 좌로, true면 우로 이동/병합
    static int[] processLine(int[] line, boolean reverse) {
        int[] arr = Arrays.copyOf(line, line.length);
        if (reverse) reverseArr(arr);

        int n = arr.length;
        // 1) 압축
        int[] tmp = new int[n];
        int t = 0;
        for (int x : arr) if (x != 0) tmp[t++] = x;

        // 2) 단일 병합
        int[] res = new int[n];
        int w = 0;
        for (int i = 0; i < t; i++) {
            if (i + 1 < t && tmp[i] == tmp[i + 1]) {
                res[w++] = tmp[i] << 1;
                i++; // 재병합 금지
            } else res[w++] = tmp[i];
        }
        // 3) 재압축(뒤는 이미 0)
        if (reverse) reverseArr(res);
        return res;
    }

    static void reverseArr(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
    }

    static int[] getCol(int[][] b, int c) {
        int[] col = new int[N];
        for (int r = 0; r < N; r++) col[r] = b[r][c];
        return col;
    }

    static void setCol(int[][] b, int c, int[] col) {
        for (int r = 0; r < N; r++) b[r][c] = col[r];
    }

    static int[][] deepCopy(int[][] a) {
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) System.arraycopy(a[i], 0, c[i], 0, N);
        return c;
    }

    static boolean same(int[][] a, int[][] b) {
        for (int i = 0; i < N; i++) if (!Arrays.equals(a[i], b[i])) return false;
        return true;
    }

    static int getMax(int[][] b) {
        int v = 0;
        for (int[] row : b) for (int x : row) v = Math.max(v, x);
        return v;
    }
}
