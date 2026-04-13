import java.util.*;

public class Main{
    public static List<ArrayList<Integer>> list=new LinkedList<>();
    public static Set<Integer> set=new HashSet<>();
    public static boolean visited[];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        visited=new boolean[n+1];
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int n1=s.nextInt();
            int n2=s.nextInt();
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
        bfs(1);
        //System.out.println(set);
        System.out.print(set.size()-1);
    }
    public static void bfs(int i){
        Queue<int[]> q=new LinkedList<>();
        int depth=0;
        q.offer(new int[]{i,depth});
        set.add(1);
        visited[i]=true;
        while(!q.isEmpty()){
            int num[]=q.poll();
            if(num[1]==2)break;
            for(int k=0;k<list.get(num[0]).size();k++){
               
                    q.offer(new int[]{list.get(num[0]).get(k),num[1]+1});
                    set.add(list.get(num[0]).get(k));
                    visited[list.get(num[0]).get(k)]=true;
                
            }
        }
    }
}