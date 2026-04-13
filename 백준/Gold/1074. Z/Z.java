import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int n = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int result = 0;

        System.out.println(z(n, x, y, result));
    }

    public static int z(int n, int x, int y, int result) {
        if (n == 0) return result;


        int half = (int) Math.pow(2, n-1);
        int quadrant;

        if(x >= half && y >= half) {
            quadrant = 3;
            x -= half;
            y -= half;
        }
        else if(x < half && y >= half) {
            quadrant = 2;
            y -= half;
        }
        else if(x >= half && y < half) {
            quadrant = 1;
            x -= half;
        }
        else quadrant = 0;


        int initNum = (int) Math.pow(4, n-1);
        result += (initNum * quadrant);


        return z(--n, x, y, result);
    }
}
