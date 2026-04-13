import java.util.*;

public class Main{
    public static boolean visited[][];
    public static char color[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int colorblind=0;
        int notColorblind=0;
        visited=new boolean[n][n];
        color=new char[n][n];
        
        for(int i=0;i<n;i++){
            String str=s.next();
            for(int j=0;j<n;j++){
                color[i][j]=str.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(!visited[i][j]){
                   dfs(i,j,color[i][j]);
                   notColorblind++;
               }
            }
        }
        visited=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(!visited[i][j]){
                   dfs2(i,j,color[i][j]);
                   colorblind++;
               }
            }
        }
        System.out.println(notColorblind+" "+colorblind);
    }
    
    public static void dfs(int x,int y,char start){
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        visited[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<visited.length&&ny<visited[0].length){
                if(!visited[nx][ny]&&start==color[nx][ny]){
                    dfs(nx,ny,start);
                }
            }
        }
    }
    
    public static void dfs2(int x,int y,char start){
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        visited[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<visited.length&&ny<visited[0].length&&!visited[nx][ny]){
                if(start==color[nx][ny]){
                    dfs2(nx,ny,start);
                }
                else if((start=='R'&&color[nx][ny]=='G')||(start=='G'&&color[nx][ny]=='R')){
                    dfs2(nx,ny,start);
                }
            }
        }
    }
    
}