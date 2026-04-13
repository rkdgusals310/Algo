import java.util.*;

public class Main{
    public static boolean visited[][];
    public static List<Integer> list=new LinkedList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int map[][]=new int[n+1][n+1];
        visited=new boolean[n+1][n+1];
        for(int i=1;i<=n;i++){
            String str=s.next();
            for(int j=1;j<=n;j++){
                map[i][j]=str.charAt(j-1)-'0';
            } 
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(!visited[i][j]&&map[i][j]==1){
                    bfs(i,j,map);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(list.size()).append("\n");
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.print(sb);
    }
    public static void bfs(int i,int j,int map[][]){
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j]=true;
        int cnt=1;
        int x[]={0,0,-1,1};//상하좌우
        int y[]={-1,1,0,0};
        while(!queue.isEmpty()){
            int xy[]=queue.poll();
           
            for(int k=0;k<4;k++){
                int nx=xy[1]+x[k];
                int ny=xy[0]+y[k];
                if(ny<map[0].length&&ny>0&&nx<map[0].length&&nx>0){
                    if(!visited[ny][nx]&&map[ny][nx]==1){
                        queue.offer(new int[]{ny,nx});
                        visited[ny][nx]=true;
                        cnt++; 
                    }
                    
                }
            }
            
        }
        list.add(cnt);
    }
}