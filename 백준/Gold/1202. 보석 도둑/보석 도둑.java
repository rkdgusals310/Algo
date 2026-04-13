import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int K = sc.nextInt(); 

      
        List<Jewel> jewels = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int v = sc.nextInt(); 
            jewels.add(new Jewel(m, v));
        }
        Collections.sort(jewels); 

        
        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = sc.nextInt();
        }
        Arrays.sort(bags); 

        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        
        long maxValue = 0;
        int jewelIdx = 0;

        for (int bag : bags) {
            while (jewelIdx < N && jewels.get(jewelIdx).weight <= bag) {
                pq.offer(jewels.get(jewelIdx).value);
                jewelIdx++;
            }
            if (!pq.isEmpty()) {
                maxValue += pq.poll();
            }
        }

        System.out.println(maxValue);
        sc.close();
    }

    static class Jewel implements Comparable<Jewel> {
        int weight, value;
        public Jewel(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
        @Override
        public int compareTo(Jewel o) {
            return Integer.compare(this.weight, o.weight);
        }
    }
}
