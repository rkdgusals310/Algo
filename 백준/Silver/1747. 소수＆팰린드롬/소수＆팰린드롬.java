import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int size = 1003002; 

        boolean[] isNotPrime = new boolean[size]; 
        isNotPrime[0] = isNotPrime[1] = true;

        // 에라토스테네스의 체
        for (int i = 2; i * i < size; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < size; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        for (int i = n; i < size; i++) {
            if (!isNotPrime[i] && isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }
}
