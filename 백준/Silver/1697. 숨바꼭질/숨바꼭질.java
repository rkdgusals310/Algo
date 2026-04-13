import java.util.*;

public class Main{
    public static boolean visited[];
    public static int second;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int k=s.nextInt();
        
        visited=new boolean[100001];
        
        dfs(n,k,0);
        System.out.print(second);
    }
    public static void dfs(int n,int k,int sec){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{n,sec});
        visited[n]=true;
        while(!q.isEmpty()){
            int loc[]=q.poll();
            if(loc[0]==k){second=loc[1];break;}
            int move[]={loc[0]-1,loc[0]+1,loc[0]*2};
            
            for(int i=0;i<3;i++){
                if(move[i]>=0&&move[i]<=100000&&!visited[move[i]]){
                    visited[move[i]]=true;
                    q.offer(new int[]{move[i],loc[1]+1});
                }
            }
            
        }
    }
}