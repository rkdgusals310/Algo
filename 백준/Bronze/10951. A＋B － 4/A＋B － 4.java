import java.util.Scanner;
public class Main{
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String test = s.nextLine();
            if (test == null || test.trim().isEmpty()) {
                break;
            }

            String str[] = test.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a + b);
        }
    }
}