import java.util.*;

public class Main{
    public static boolean visited[];
    
    public static List<ArrayList<Integer>> list;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int test=s.nextInt();
        for(int t=0;t<test;t++){
            int n=s.nextInt();
            int num[]=new int[n+1];
            int count=0;
            visited=new boolean[n+1];
            list=new LinkedList<>();
            for(int i=0;i<=n;i++){
                if(i!=0)num[i]=s.nextInt();
                list.add(new ArrayList<>());
            }
            for(int i=1;i<=n;i++){
                list.get(i).add(num[i]);
            }
            for(int i=1;i<=n;i++){
                if(!visited[i]){
                    bfs(i);
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
    public static void bfs(int i){
        Queue<Integer>q=new LinkedList<>();
        q.offer(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int number=q.poll();
            for(int k=0;k<list.get(number).size();k++){
                if(!visited[list.get(number).get(k)]){
                    visited[list.get(number).get(k)]=true;
                    q.offer(list.get(number).get(k));
                }
            }
        }
    }
}