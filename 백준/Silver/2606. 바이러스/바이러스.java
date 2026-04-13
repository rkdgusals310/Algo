import java.util.*;

public class Main{
    public static boolean visited[];
    public static int count=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int computerN=s.nextInt();
        int linkedN=s.nextInt();
        visited=new boolean[computerN+1];
        List<ArrayList<Integer>> linkedComputer=new LinkedList<>();
        for(int i=0;i<=computerN;i++){
            linkedComputer.add(new ArrayList<>());
        }
        for(int i=0;i<linkedN;i++){
            int n1=s.nextInt();
            int n2=s.nextInt();
            linkedComputer.get(n1).add(n2);
            linkedComputer.get(n2).add(n1);
        }
        
        bfs(1,linkedComputer);
        System.out.print(count);
    }
    public static void bfs(int start,List<ArrayList<Integer>> linkedComputer){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        visited[start]=true;
        
        while(!q.isEmpty()){
            int num=q.poll();
            for(int i=0;i<linkedComputer.get(num).size();i++){
                if(!visited[linkedComputer.get(num).get(i)]){
                    visited[linkedComputer.get(num).get(i)]=true;
                    q.offer(linkedComputer.get(num).get(i));
                    count++;
                }
            }
        }
    }
}

