import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i] > list.get(list.size() - 1)) {
                list.add(arr[i]);
            } else {
                int left = 0;
                int right = list.size() - 1;
                int pos = list.size(); 

                while(left <= right) {
                    int mid = (left + right) / 2;

                    if(list.get(mid) >= arr[i]) {
                        pos = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(pos, arr[i]); 
            }
        }

        System.out.println(list.size());
    }
}
