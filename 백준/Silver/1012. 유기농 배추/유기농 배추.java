import java.util.*;

public class Main{
    public static boolean visited[][];
    public static int field[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            int k=s.nextInt();
            int cnt=0;
            visited=new boolean[n][m];
            field=new int[n][m];

            for(int j=0;j<k;j++){
                int x=s.nextInt();
                int y=s.nextInt();
                field[x][y]=1;
            }
            for(int j=0;j<n;j++){
                for(int l=0;l<m;l++){
                    if(!visited[j][l]&&field[j][l]!=0){
                        dfs(j,l);
                        cnt++;
                    }
                }
            }sb.append(cnt).append("\n");
        }
        System.out.print(sb);
  
    }
    public static void dfs(int x,int y){
        if(visited[x][y]||field[x][y]==0){
            return;
        }
        
        visited[x][y]=true;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<visited.length&&ny<visited[0].length){
                dfs(nx,ny);
            }
        }
    }
}