import java.util.*;

public class Main {
    static class Question {
        int number, strike, ball;

        public Question(int number, int strike, int ball) {
            this.number = number;
            this.strike = strike;
            this.ball = ball;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Question> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int s = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Question(num, s, b));
        }

        int count = 0;
        for (int i = 123; i <= 987; i++) {
            if (!isValid(i)) continue;

            boolean flag = true;
            for (Question q : list) {
                int s = getStrike(i, q.number);
                int b = getBall(i, q.number);
                if (s != q.strike || b != q.ball) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;
        }

        System.out.println(count);
    }

    // 유효한 숫자인지 체크 (0 포함 X, 중복 X)
    public static boolean isValid(int num) {
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        return a != 0 && b != 0 && c != 0 && a != b && a != c && b != c;
    }

    public static int getStrike(int a, int b) {
        int[] A = {a / 100, (a / 10) % 10, a % 10};
        int[] B = {b / 100, (b / 10) % 10, b % 10};
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (A[i] == B[i]) strike++;
        }
        return strike;
    }

    public static int getBall(int a, int b) {
        int[] A = {a / 100, (a / 10) % 10, a % 10};
        int[] B = {b / 100, (b / 10) % 10, b % 10};
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && A[i] == B[j]) ball++;
            }
        }
        return ball;
    }
}
