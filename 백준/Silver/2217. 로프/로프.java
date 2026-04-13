import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ropeTotal[] = new int[n];
        int maxKg = 0;
        for (int i = 0; i < n; i++) {
            int rope = s.nextInt();
            ropeTotal[i] = rope;
        }
        Arrays.sort(ropeTotal);
        if (ropeTotal.length > 1) {
            for (int i = 1; i < n; i++) {

                if (ropeTotal[n - 1] > ropeTotal[n - 1-i]*(i+1)) {
                    if(maxKg<ropeTotal[n-1])maxKg = ropeTotal[n - 1];
                } else {
                    if(maxKg<ropeTotal[n - 1-i]*(i+1))
                    maxKg = ropeTotal[n - 1-i]*(i+1);
                }
                //System.out.println(i+" "+maxKg);
            }
        } else {
            maxKg = ropeTotal[0];
        }

        System.out.println(maxKg);
    }

}