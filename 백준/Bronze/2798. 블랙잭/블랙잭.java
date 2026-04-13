import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum=arr[i]+arr[j]+arr[k];
	             
					if (sum > max && sum <= m) {
						max = sum;					
					} 
				}
			}
		}
		System.out.println(max);

	}
}