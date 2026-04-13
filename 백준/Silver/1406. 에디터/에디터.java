import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        int n = s.nextInt(); s.nextLine();

        Stack<Character> leftStack = new Stack<>();  
        Stack<Character> rightStack = new Stack<>(); 
        
        for (char ch : str.toCharArray()) {
            leftStack.push(ch);
        }
        
        for (int i = 0; i < n; i++) {
            String order = s.next();
            
            switch (order) {
                case "L": 
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;
                    
                case "D":
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;
                    
                case "B":
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                    
                case "P":
                    char ch = s.next().charAt(0);
                    leftStack.push(ch);
                    break;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            result.append(rightStack.pop());
        }

        System.out.println(result.toString());
    }
}
