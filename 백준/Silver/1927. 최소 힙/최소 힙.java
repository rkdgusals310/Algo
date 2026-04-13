import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        PriorityQueue<Integer> minH=new PriorityQueue<>();
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            if(num==0){
                if(minH.isEmpty()){sb.append(0).append("\n");}
                else{
                    sb.append(minH.poll()).append("\n");
                }
            }
            else{
               minH.offer(num); 
            }
        }System.out.print(sb);
    }
}