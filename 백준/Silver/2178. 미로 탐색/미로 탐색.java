import java.util.*;

public class Main{
    public static int map[][];
    public static boolean visited[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        map=new int[n][m];
        visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            String str=s.next();
            for(int j=0;j<m;j++){
                map[i][j]=str.charAt(j)-'0';
            }
            
        }
        bfs(0,0);
        System.out.print(map[n-1][m-1]);
    }
    
    public static void bfs(int x,int y){
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{x,y});
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        
        while(!queue.isEmpty()){
            int num[]=queue.poll();
            
            
            for(int i=0;i<4;i++){
                int nx=num[0]+dx[i];
                int ny=num[1]+dy[i];
                if(nx>=0&&ny>=0&&nx<map.length&&ny<map[0].length){
                    if(map[nx][ny]==1){
                        map[nx][ny]=map[num[0]][num[1]]+1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
            
            
        }
    }
}