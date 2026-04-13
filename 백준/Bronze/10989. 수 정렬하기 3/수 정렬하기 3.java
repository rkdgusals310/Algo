import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        int[] count = new int[10001];
        
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            count[input]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
