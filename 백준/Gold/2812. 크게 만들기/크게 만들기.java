import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        String number = sc.next(); 

        Deque<Character> stack = new ArrayDeque<>();
        int count = k;

        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && count > 0 && stack.peekLast() < c) {
                stack.pollLast();
                count--;
            }
            stack.addLast(c);
        }

        
        while (count-- > 0) {
            stack.pollLast();
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
