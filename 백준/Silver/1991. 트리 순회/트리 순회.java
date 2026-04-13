import java.io.*;
import java.util.*;

public class Main {
    static List<List<Character>> child = new ArrayList<>(26);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 26; i++) child.add(new ArrayList<>(Arrays.asList('.', '.')));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);
            int idx = root - 'A';
            child.get(idx).set(0, l);
            child.get(idx).set(1, r);
        }
        preorder('A');
        sb.append('\n');
        inorder('A');
        sb.append('\n');
        postorder('A');
        System.out.println(sb);
    }

    static void preorder(char u) {
        if (u == '.') return;
        sb.append(u);
        List<Character> c = child.get(u - 'A');
        preorder(c.get(0));
        preorder(c.get(1));
    }

    static void inorder(char u) {
        if (u == '.') return;
        List<Character> c = child.get(u - 'A');
        inorder(c.get(0));
        sb.append(u);
        inorder(c.get(1));
    }

    static void postorder(char u) {
        if (u == '.') return;
        List<Character> c = child.get(u - 'A');
        postorder(c.get(0));
        postorder(c.get(1));
        sb.append(u);
    }
}
