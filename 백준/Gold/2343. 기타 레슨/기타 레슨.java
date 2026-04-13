import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        long sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
            if (a[i] > max) max = a[i];
        }

        long low = max;
        long high = sum;
        long ans = high;

        while (low <= high) {
            long mid = (low + high) / 2;
            int need = 1;
            long curr = 0;

            for (int x : a) {
                if (x > mid) {
                    need = m + 1;
                    break;
                }
                if (curr + x <= mid) {
                    curr += x;
                } else {
                    need++;
                    curr = x;
                }
            }

            if (need <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
