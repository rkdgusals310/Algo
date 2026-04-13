import java.util.Scanner;

public class Main {
    static int n, s, count;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        count = 0;
        dfs(0, 0);
       
        if (s == 0) count--;

        System.out.println(count);
    }

   
    static void dfs(int idx, int sum) {
        if (idx == n) {
            if (sum == s) count++;
            return;
        }

        
        dfs(idx + 1, sum + arr[idx]);
        
        dfs(idx + 1, sum);
    }
}
