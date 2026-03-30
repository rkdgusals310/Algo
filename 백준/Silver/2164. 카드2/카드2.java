import java.util.*;

public class Main{
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++)q.offer(i);
        
        while(q.size()!=1){
            q.poll();
            if(q.size()==1)break;
            q.offer(q.poll());
        }
        System.out.print(q.poll());
        

    }
}