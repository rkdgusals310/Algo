import java.util.*;

public class Main{
    public static int count=0;
    public static boolean visited[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int map[][]=new int[n+1][m+1];
        visited=new boolean[n+1][m+1];
        for(int i=0;i<k;i++){
            int y=s.nextInt();
            int x=s.nextInt();
            map[y][x]=1;
        }
        int max=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(!visited[i][j]&&map[i][j]==1){
                    bfs(i,j,map);
                    max=max<count?count:max;
                    count=0;
                }
                
            }
        }
        System.out.print(max);
    }
    
    public static void bfs(int i,int j,int map[][]){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        count++;
        visited[i][j]=true;
        int x[]={0,0,-1,1};
        int y[]={-1,1,0,0};
        while(!q.isEmpty()){
            int xy[]=q.poll();
            for(int k=0;k<4;k++){
                int ny=xy[0]+y[k];
                int nx=xy[1]+x[k];
                
                if(nx>=0&&nx<map[0].length&&ny>=0&&ny<map.length){
                    if(!visited[ny][nx]&&map[ny][nx]==1){
                        visited[ny][nx]=true;
                        count+=1;
                        //System.out.println("ss"+count);
                        q.offer(new int[]{ny,nx});
                    }
                }
            }
            
        }
        
    }
}