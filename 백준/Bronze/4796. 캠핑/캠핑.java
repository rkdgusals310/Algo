import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNum = 1;
        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(line);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) break;
            int ans = (V / P) * L + Math.min(V % P, L);
            sb.append("Case ").append(caseNum++).append(": ").append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}
