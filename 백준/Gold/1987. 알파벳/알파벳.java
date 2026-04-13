import java.util.*;

public class Main{
    public static boolean visited[];
    public static char map[][];
    public static int maxLen=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int r=s.nextInt();
        int c=s.nextInt();
        map=new char[r+1][c+1];
        visited=new boolean[26];
        for(int i=1;i<=r;i++){
            String str=s.next();
            for(int j=1;j<=c;j++){
                map[i][j]=str.charAt(j-1);
            }
        }
        
        visited[map[1][1]-65]=true;
        dfs(1,1,1);
        System.out.print(maxLen);
    }
    public static void dfs(int x,int y,int cnt){
        
        
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        
        maxLen=maxLen>cnt?maxLen:cnt;
        for(int i=0;i<4;i++){
            int nx=dx[i]+x;
            int ny=dy[i]+y;
            
            if(nx>0&&ny>0&&nx<map.length&&ny<map[1].length){
                
                if(!visited[map[nx][ny]-65]){
                    visited[map[nx][ny]-65]=true;
                    dfs(nx,ny,cnt+1);
                    visited[map[nx][ny]-65]=false;
                }
                
            }
            
        }
    }
}