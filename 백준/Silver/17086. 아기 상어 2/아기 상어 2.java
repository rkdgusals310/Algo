import java.util.*;

public class Main{
    public static int ocean[][];
    public static int safeDistance=0;
    public static boolean visited[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        int max=-1;
        ocean=new int[n][m];
        visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ocean[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                if(ocean[i][j]==0){
                    int temp=sharkDetector(i,j);
                    max=max>temp?max:temp;
                }
                // else{
                //     System.out.print("s ");
                // }
            }//System.out.println();
        }
        //bfs를 통해서 최소 거리에 존재하는 상어를 찾는다. 이값을 저장하는 방식으로 진행 
        System.out.println(max);
    }
    public static int sharkDetector(int x,int y){
        Queue<int[]> loc=new LinkedList<>();
        visited=new boolean[ocean.length][ocean[0].length];
        int cnt=0;
        loc.offer(new int[]{x,y,cnt});
        visited[x][y]=true;
        int dx[]={-1,1,0,0,-1,-1,1,1};
        int dy[]={0,0,-1,1,-1,1,-1,1};
        boolean breakN=false;
        
        while(!loc.isEmpty()){
            int xyz[]=loc.poll();
            for(int i=0;i<8;i++){
                int nx=xyz[0]+dx[i];
                int ny=xyz[1]+dy[i];
                if(nx>=0&&ny>=0&&nx<ocean.length&&ny<ocean[0].length){
                    if(ocean[nx][ny]==1){
                         breakN=true;
                         cnt=xyz[2]+1;
                         break;
                    }
                    if(!visited[nx][ny]){
                        visited[nx][ny]=true;
                        loc.offer(new int[]{nx,ny,xyz[2]+1});
                    }
                    
                }
            }
            if(breakN)break;
        }
        //System.out.print(cnt+" ");
        return cnt;
    }
}