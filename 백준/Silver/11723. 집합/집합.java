import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int set = 0, ALL = (1 << 21) - 2;
        while (m-- > 0) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String cmd = st.nextToken();
            switch (cmd) {
                case "add": {
                    int x = Integer.parseInt(st.nextToken());
                    set |= (1 << x);
                    break;
                }
                case "remove": {
                    int x = Integer.parseInt(st.nextToken());
                    set &= ~(1 << x);
                    break;
                }
                case "check": {
                    int x = Integer.parseInt(st.nextToken());
                    sb.append((set & (1 << x)) != 0 ? 1 : 0).append('\n');
                    break;
                }
                case "toggle": {
                    int x = Integer.parseInt(st.nextToken());
                    set ^= (1 << x);
                    break;
                }
                case "all":
                    set = ALL;
                    break;
                case "empty":
                    set = 0;
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
