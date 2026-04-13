import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=s.nextInt();
        
        for(int j=0;j<t;j++){
        int n=s.nextInt();
        int m=s.nextInt();
        int cnt=0;
        int print=0;
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();
        List<Integer> sortQ=new LinkedList<>();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            queue.offer(num);
            queue2.offer(i);
            sortQ.add(num);
        }
        Collections.sort(sortQ,Collections.reverseOrder());
        int len=sortQ.size();
        while(true){
            if(queue.peek()==sortQ.get(0)){
                print+=1;
                if(queue2.peek()==m){break;}
                else{
                    queue.poll();
                    queue2.poll();
                    sortQ.remove(cnt);
               
                }
            }
            else{
                queue.offer(queue.poll());
                queue2.offer(queue2.poll());
               
                
            }
            
            
        }
             System.out.println(print);
        }
       
    }
    
}