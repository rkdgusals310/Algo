import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(true){
            if(a<1){
                a = sc.nextInt();
                continue;
            }
            if(b>100){
                b = sc.nextInt();
                continue;
            }
            break;
        }
        System.out.println(a+" + "+b+" = "+(a + b));
    }
}