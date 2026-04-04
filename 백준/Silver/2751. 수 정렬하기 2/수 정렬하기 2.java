import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            queue.offer(s.nextInt());
        }
        for(int i=0;i<n;i++){
            sb.append(queue.poll()).append("\n");
        }
        System.out.print(sb);
    }
}