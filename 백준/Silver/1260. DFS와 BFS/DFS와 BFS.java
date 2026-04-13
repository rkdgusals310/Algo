import java.util.*;

public class Main{
    public static boolean visited[];
    public static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        int v=s.nextInt();
        
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=1;i<=m;i++){
            int n1=s.nextInt();
            int n2=s.nextInt();
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
        for(int i=0;i<=n;i++){
            Collections.sort(list.get(i));
        }

        visited=new boolean[n+1];
        StringBuilder sb=new StringBuilder();

        dfs(v,sb);
        System.out.println(sb);
        visited=new boolean[n+1];
        
        bfs(v);
        
        
    }
    public static void bfs(int v){
        Queue<Integer> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        q.offer(v);
        visited[v]=true;
        while(!q.isEmpty()){
            int num=q.poll();
            sb.append(num).append(" ");
            for(int i:list.get(num)){
                if(!visited[i]){
                    visited[i]=true;
                    q.offer(i);
                }
            }
        }
        System.out.println(sb);
    }
    public static void dfs(int v,StringBuilder sb){
       if(visited[v])return;
       visited[v]=true;
       sb.append(v).append(" ");
       for(int i:list.get(v)){
           if(!visited[i]){
               dfs(i,sb);
               
           }
       }
       
       
    }
}