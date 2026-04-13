import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(); 
        int current = 1; 
        
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); 

            while (current <= num) { 
                stack.push(current++);
                sb.append("+\n");
            }

            if (stack.peek() == num) { 
                stack.pop();
                sb.append("-\n");
            } else { 
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
