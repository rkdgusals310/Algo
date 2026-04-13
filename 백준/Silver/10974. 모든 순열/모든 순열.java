import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        StringBuilder sb = new StringBuilder();

        do {
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
        } while (nextPermutation(arr));

        System.out.print(sb);
    }


    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;


        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }


        if (i <= 0) return false;


        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }

  
        swap(arr, i - 1, j);

        j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
