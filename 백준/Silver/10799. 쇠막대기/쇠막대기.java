import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int result = 0;
        int count = 0; 

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now == '(') {
                count++; 
            } else { // now == ')'
                count--; 

                if (str.charAt(i - 1) == '(') {
                   
                    result += count;
                } else {
                   
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
