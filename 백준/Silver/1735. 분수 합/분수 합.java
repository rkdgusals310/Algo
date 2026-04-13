import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int numerator1 = s.nextInt(); // 분자1
        int denominator1 = s.nextInt(); // 분모1

        int numerator2 = s.nextInt(); // 분자2
        int denominator2 = s.nextInt(); // 분모2

        // 최소공배수 구하기
        int lcm = denominator1 * denominator2 / gcd(denominator1, denominator2);

        // 분자 계산
        int totalNumerator = numerator1 * (lcm / denominator1) + numerator2 * (lcm / denominator2);
        int totalDenominator = lcm;

        // 분자와 분모의 최대공약수 구하기
        int gcdValue = gcd(totalNumerator, totalDenominator);

        // 기약분수 출력
        System.out.print((totalNumerator / gcdValue) + " " + (totalDenominator / gcdValue));
    }

    // 최대공약수 구하는 함수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
