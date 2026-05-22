import java.io.*;
import java.util.*;

public class Solution {

    static class Task {
        int time;
        int deadline;

        Task(int time, int deadline) {
            this.time = time;
            this.deadline = deadline;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < TC; tc++) {
            int N = Integer.parseInt(br.readLine());

            Task[] tasks = new Task[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int time = Integer.parseInt(st.nextToken());
                int deadline = Integer.parseInt(st.nextToken());

                tasks[i] = new Task(time, deadline);
            }

            Arrays.sort(tasks, (a, b) -> a.deadline - b.deadline);

            int latest = Integer.MAX_VALUE;

            for (int i = N - 1; i >= 0; i--) {
                latest = Math.min(latest, tasks[i].deadline);
                latest -= tasks[i].time;
            }

            sb.append(latest).append('\n');
        }

        System.out.print(sb);
    }
}