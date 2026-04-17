import java.util.*;

public class Main{
    public static int map[][];
    public static int safe=0;
    public static int safe2=0;
    public static int zero=0;
    public static List<int[]> list=new LinkedList<>();
    public static List<Integer> list2=new LinkedList<>();
    public static boolean visited[][];
    public static boolean visited2[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        map=new int[n][m];
        visited=new boolean[n][m];
        for(int i=0;i<3;i++){
            list.add(new int[2]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map[i][j]=s.nextInt();
                if(map[i][j]==0)zero++;
 
            }
        }
        
        

       dfs(0,0,0);

        System.out.println(safe);
    }
    
    public static void dfs(int x,int y,int depth){
        if(depth==3){
            visited2=new boolean[map.length][map[0].length];
            
            for(int i=0;i<3;i++){
                int xx=list.get(i)[0];
                int yy=list.get(i)[1];
                visited2[xx][yy]=true;
                map[xx][yy]=1;
            }
            int sum = 0;
            int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    if (map[i][j] == 2) {
                        for (int d = 0; d < 4; d++) {
                            int nx = i + dx[d], ny = j + dy[d];
                            if (0 <= nx && 0 <= ny && nx < map.length && ny < map[0].length) {
                                if (!visited2[nx][ny] && map[nx][ny] == 0) {
                                    visited2[nx][ny] = true;
                                    sum += len(nx, ny);
                                }
                            }
                        }
                    }
                }
            }

            for(int i=0;i<3;i++){
                int xx=list.get(i)[0];
                int yy=list.get(i)[1];
                map[xx][yy]=0;
            }
            
            safe=Math.max(safe,zero-3-sum);
            return;
        }
        
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(!visited[i][j]&&map[i][j]==0){
                    visited[i][j]=true;
                    list.get(depth)[0]=i;
                    list.get(depth)[1]=j;
                    dfs(i,j,depth+1);
                    visited[i][j]=false;
                }
            }
        }
    }
    
    public static int len(int x,int y){
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        visited2[x][y]=true;
        int cnt=1;
        if(map[x][y]==2){}
        for(int i=0;i<4;i++){
            int nx=dx[i]+x;
            int ny=dy[i]+y;
            if(nx>=0&&ny>=0&&nx<map.length&&ny<map[0].length){
                if(!visited2[nx][ny]&&map[nx][ny]==0){
                    cnt+=len(nx,ny);
                }
            }
        }
        
        return cnt;
        
    }
}