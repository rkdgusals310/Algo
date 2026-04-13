import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String commands = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            
            int[] arr = new int[n];
            int start = 0, end = n - 1;
            boolean isReversed = false;
            boolean isError = false;
            
            if (n > 0) {
                input = input.substring(1, input.length() - 1);
                String[] elements = input.split(",");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(elements[i]);
                }
            }
            
            for (char cmd : commands.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (start > end) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
            
            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                if (!isReversed) {
                    for (int i = start; i <= end; i++) {
                        sb.append(arr[i]);
                        if (i != end) {
                            sb.append(",");
                        }
                    }
                } else {
                    for (int i = end; i >= start; i--) {
                        sb.append(arr[i]);
                        if (i != start) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]\n");
            }
        }
        
        System.out.print(sb);
    }
}
