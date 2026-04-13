import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] house = new int[n];
        for (int i = 0; i < n; i++) {
            house[i] = sc.nextInt();
        }
        Arrays.sort(house);
        int low = 1;
        int high = house[n - 1] - house[0];
        int answer = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int count = 1;
            int last = house[0];
            for (int i = 1; i < n; i++) {
                if (house[i] - last >= mid) {
                    count++;
                    last = house[i];
                }
            }
            if (count >= c) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
