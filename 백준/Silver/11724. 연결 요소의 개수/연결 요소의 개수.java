import java.util.*;

public class Main{
    public static boolean visited[];
    public static ArrayList<ArrayList<Boolean>> list=new ArrayList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        int cnt=0;
        visited=new boolean[n];
        for(int i=0;i<n;i++){
            list.add(new ArrayList());
            for(int j=0;j<n;j++){
                list.get(i).add(false);
            }
        }
        for(int i=0;i<m;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            list.get(a-1).set(b-1,true);
            list.get(b-1).set(a-1,true);
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
    
    public static void dfs(int start){
        if(visited[start])return;
        visited[start]=true;
        for(int i=0;i<visited.length;i++){
            if(list.get(start).get(i)){
                dfs(i);
                
            }
        }
    }
}