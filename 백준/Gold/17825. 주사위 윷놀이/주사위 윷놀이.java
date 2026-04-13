import java.util.*;

public class Main {
    static final int START = 0, END = 32, NODES = 33;
    static int[] dice = new int[10];
    static int[] score = new int[NODES];
    static int[] next = new int[NODES];
    static int[] blue = new int[NODES];
    static int[] pos = new int[4];
    static boolean[] occupied = new boolean[NODES];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) dice[i] = s.nextInt();
        initBoard();
        dfs(0, 0);
        System.out.println(ans);
    }

    static void initBoard() {
        Arrays.fill(blue, -1);
        for (int i = 0; i < 20; i++) next[i] = i + 1;
        next[20] = END;
        next[END] = END;

        blue[5] = 21;
        blue[10] = 25;
        blue[15] = 27;

        next[21] = 22; score[21] = 13;
        next[22] = 23; score[22] = 16;
        next[23] = 24; score[23] = 19;

        next[25] = 26; score[25] = 22;
        next[26] = 24; score[26] = 24;

        next[27] = 28; score[27] = 28;
        next[28] = 29; score[28] = 27;
        next[29] = 24; score[29] = 26;

        next[24] = 30; score[24] = 25;
        next[30] = 31; score[30] = 30;
        next[31] = 20; score[31] = 35;

        for (int i = 0; i <= 20; i++) score[i] = i * 2;
        score[END] = 0;

        Arrays.fill(pos, START);
    }

    static int move(int node, int steps) {
        if (node == END) return END;
        if (steps == 0) return node;
        if (blue[node] != -1) node = blue[node];
        else node = next[node];
        steps--;
        while (steps-- > 0 && node != END) node = next[node];
        return node;
    }

    static void dfs(int turn, int sum) {
        if (turn == 10) {
            ans = Math.max(ans, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (pos[i] == END) continue;
            int from = pos[i];
            int to = move(from, dice[turn]);
            if (to != END && to != START && occupied[to]) continue;
            boolean fromOccCleared = false;
            boolean toOccSet = false;

            if (from != START && occupied[from]) {
                occupied[from] = false;
                fromOccCleared = true;
            }
            if (to != END) {
                occupied[to] = true;
                toOccSet = true;
            }

            pos[i] = to;
            dfs(turn + 1, sum + (to == END ? 0 : score[to]));
            pos[i] = from;

            if (toOccSet) occupied[to] = false;
            if (fromOccCleared) occupied[from] = true;
        }
    }
}
