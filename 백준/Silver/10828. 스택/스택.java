import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n];
		int size = 0;

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
				case "push":
					int value = Integer.parseInt(st.nextToken());
					stack[size++] = value;
					break;
				case "pop":
					if (size == 0) {
						sb.append("-1\n");
					} else {
						sb.append(stack[--size]).append("\n");
					}
					break;
				case "size":
					sb.append(size).append("\n");
					break;
				case "empty":
					sb.append(size == 0 ? 1 : 0).append("\n");
					break;
				case "top":
					if (size == 0) {
						sb.append("-1\n");
					} else {
						sb.append(stack[size - 1]).append("\n");
					}
					break;
			}
		}
		System.out.print(sb);
	}
}
