import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[20_000_001]; // 입력 범위가 -10,000,000 이상 10,000,000 이하인 정수들이므로 0부터 20,000,000까지의 인덱스를 사용
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            counts[num + 10_000_000]++; // 음수를 배열 인덱스에 사용할 수 없으므로 오프셋을 적용하여 배열에 저장
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(counts[num + 10_000_000]).append(" "); // 음수를 배열 인덱스에 사용할 수 없으므로 오프셋을 적용하여 배열에서 값을 가져옴
        }
        System.out.println(sb);
    }
}
