import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = s.nextInt();

        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int absA = Math.abs(a), absB = Math.abs(b);
                if (absA == absB) return a - b; 
                return absA - absB;
            }
        );

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();

            if (num != 0) {
                pq.offer(num);
            } else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
