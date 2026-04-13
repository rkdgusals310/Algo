import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<n; i++)
        {
            num = scanner.nextInt();
            if(num == 0)
            {
                sb.append(queue.isEmpty() ? "0" : queue.poll());
                sb.append("\n");
            }
            else
            {
                queue.add(num);
            }
        }
        System.out.println(sb);
    }
}