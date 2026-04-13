import java.util.*;

public class Main {
    static List<int[]>[] g;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), w = sc.nextInt();
            g[a].add(new int[]{b, w});
            g[b].add(new int[]{a, w});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            sb.append(bfs(u, v)).append('\n');
        }
        System.out.print(sb);
    }

    static int bfs(int s, int t) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        dist[s] = 0;
        q.offer(s);
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == t) return dist[t];
            for (int[] nx : g[cur]) {
                int v = nx[0], w = nx[1];
                if (dist[v] == -1) {
                    dist[v] = dist[cur] + w;
                    q.offer(v);
                }
            }
        }
        return -1;
    }
}
