import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static List<Node>[] tree;
    static boolean[] visited;
    static int maxDistance = 0;
    static int farthestNode = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 1) { 
            System.out.println(0);
            return;
        }

        tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                i--; 
                continue;
            }
            StringTokenizer st = new StringTokenizer(line);
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            tree[parent].add(new Node(child, weight));
            tree[child].add(new Node(parent, weight));
        }

        visited = new boolean[n + 1];
        dfs(1, 0);

        visited = new boolean[n + 1];
        maxDistance = 0;
        dfs(farthestNode, 0);

        System.out.println(maxDistance);
    }

    static void dfs(int current, int distance) {
        visited[current] = true;
        if (distance > maxDistance) {
            maxDistance = distance;
            farthestNode = current;
        }
        for (Node next : tree[current]) {
            if (!visited[next.to]) {
                dfs(next.to, distance + next.weight);
            }
        }
    }
}
