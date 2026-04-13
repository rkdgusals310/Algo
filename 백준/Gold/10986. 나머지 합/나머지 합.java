import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] prefixMod = new long[M]; 
        long sum = 0, count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(st.nextToken());
            int mod = (int) (sum % M);
            if (mod < 0) mod += M; 
            
            prefixMod[mod]++; 
        }

  
        count += prefixMod[0]; 
        for (int i = 0; i < M; i++) {
            if (prefixMod[i] > 1) {
                count += (prefixMod[i] * (prefixMod[i] - 1)) / 2; 
            }
        }

        System.out.println(count);
    }
}
