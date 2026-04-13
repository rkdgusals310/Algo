import java.io.*;
import java.util.*;

public class Main {
    static String bfs(int start, int target) {
        boolean[] visited = new boolean[10000];
        int[] from = new int[10000];
        char[] how = new char[10000];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            if (x == target) break;

            int d = (x * 2) % 10000;
            if (!visited[d]) { visited[d] = true; from[d] = x; how[d] = 'D'; q.add(d); }

            int s = (x == 0) ? 9999 : x - 1;
            if (!visited[s]) { visited[s] = true; from[s] = x; how[s] = 'S'; q.add(s); }

            int l = (x % 1000) * 10 + x / 1000;
            if (!visited[l]) { visited[l] = true; from[l] = x; how[l] = 'L'; q.add(l); }

            int r = (x % 10) * 1000 + x / 10;
            if (!visited[r]) { visited[r] = true; from[r] = x; how[r] = 'R'; q.add(r); }
        }
        StringBuilder sb = new StringBuilder();
        int cur = target;
        while (cur != start) {
            sb.append(how[cur]);
            cur = from[cur];
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            out.append(bfs(A, B)).append('\n');
        }
        System.out.print(out.toString());
    }
}
