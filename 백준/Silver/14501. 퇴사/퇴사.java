import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] time = new int[n];
        int[] pay = new int[n];

        for (int i = 0; i < n; i++) {
            time[i] = s.nextInt();
            pay[i] = s.nextInt();
        }

        int maxPay = 0;

        
        for (int mask = 0; mask < (1 << n); mask++) {
            int totalPay = 0;
            int day = 0;
            boolean valid = true; 

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) { 
                    if (day > i) { 
                        valid = false; 
                        break;
                    }

                    if (i + time[i] > n) { 
                        valid = false; 
                        break;
                    }

                    totalPay += pay[i]; 
                    day = i + time[i]; 
                }
            }

            if (valid) {
                maxPay = Math.max(maxPay, totalPay);
            }
        }

        System.out.println(maxPay);
    }
}
