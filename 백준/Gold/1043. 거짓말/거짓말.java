import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<int[]> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); 
        int m = s.nextInt(); 
        int t = s.nextInt(); 

        for (int i = 0; i < t; i++) {
            set.add(s.nextInt());
        }

        
        for (int i = 0; i < m; i++) {
            int p = s.nextInt();
            int[] arr = new int[p];
            for (int j = 0; j < p; j++) {
                arr[j] = s.nextInt();
            }
            list.add(arr);
        }

       
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int[] party : list) {
                boolean hasTruth = false;
                for (int person : party) {
                    if (set.contains(person)) {
                        hasTruth = true;
                        break;
                    }
                }
                if (hasTruth) {
                    for (int person : party) {
                        if (set.add(person)) {
                            changed = true; 
                        }
                    }
                }
            }
        }


        int cnt = 0;
        for (int[] party : list) {
            boolean hasTruth = false;
            for (int person : party) {
                if (set.contains(person)) {
                    hasTruth = true;
                    break;
                }
            }
            if (!hasTruth) cnt++;
        }

        System.out.print(cnt);
    }
}
