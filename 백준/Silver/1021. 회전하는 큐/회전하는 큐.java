import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); 
        int m = s.nextInt(); 
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = s.nextInt();
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            int target = targets[i];
            int idx = queue.indexOf(target);

            if (idx <= queue.size() / 2) {
                while (queue.peekFirst() != target) {
                    queue.offerLast(queue.pollFirst());
                    count++;
                }
            } else {
                while (queue.peekFirst() != target) {
                    queue.offerFirst(queue.pollLast());
                    count++;
                }
            }

            queue.pollFirst(); 
        }

        System.out.println(count);
    }
}
