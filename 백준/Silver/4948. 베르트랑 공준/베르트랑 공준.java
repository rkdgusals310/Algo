import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MAX = 246912;
        boolean[] isNotPrime = new boolean[MAX + 1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!isNotPrime[i]) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
