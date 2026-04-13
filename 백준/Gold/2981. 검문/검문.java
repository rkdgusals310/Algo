import java.util.*;
import java.io.*;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int g = arr[1] - arr[0];
        for(int i = 2; i < N; i++) {
            g = gcd(g, arr[i] - arr[i - 1]);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(g); i++) {
            if(g % i == 0) {
                result.add(i);
                if(i != g / i) {
                    result.add(g / i);
                }
            }
        }
        result.add(g);

        Collections.sort(result);
        for(int m : result) {
            System.out.print(m + " ");
        }
    }
}
