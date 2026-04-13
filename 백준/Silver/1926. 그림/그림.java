import java.util.*;

public class Main{
    public static ArrayList<Integer> list=new ArrayList<>();
    public static boolean visited[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int painting[][]=new int[n][m];
        visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                painting[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&painting[i][j]==1){
                    bfs(i,j,painting);
                }
            }
        }
        int max=0;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.print(list.size()+"\n"+max);
        
    }
    public static void bfs(int i,int j,int painting[][]){
        Queue<int[]> q=new LinkedList<>();
        
        q.offer(new int[]{i,j});
        visited[i][j]=true;
        int x[]={0,0,-1,1};
        int y[]={-1,1,0,0};
        int cnt=1;
        while(!q.isEmpty()){
            int xy[]=q.poll();
            
            for(int k=0;k<4;k++){
                int nx=xy[1]+x[k];
                int ny=xy[0]+y[k];
                
                if(nx>=0&&nx<painting[0].length&&ny>=0&&ny<painting.length){
                    if(!visited[ny][nx]&&painting[ny][nx]==1){
                        q.offer(new int[]{ny,nx});
                        visited[ny][nx]=true;
                        cnt++;
                    }
                }
            }
        }
        list.add(cnt);
    }
}