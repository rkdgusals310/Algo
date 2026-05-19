import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    public static int map[][]=new int[100][100];
    public static boolean visited[][]=new boolean[100][100];
    public static int min=Integer.MAX_VALUE;
    public static int minIndex=0;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int t=sc.nextInt();
            min=Integer.MAX_VALUE;
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                	map[i][j]=sc.nextInt();
                }
            }
            
            for(int i=0;i<100;i++){
            	if(map[0][i]!=0){
                    visited=new boolean[100][100];
                	bfs(i,0,1);   
                }
            }
            sb.append("#"+t+" "+minIndex).append("\n");

		}			
        System.out.print(sb);
	}
    public static void bfs(int x,int y,int cnt){
        Queue<int[]>q=new LinkedList<>();
        
        q.offer(new int[]{x,y,cnt});
        int dx[]={-1,1,0};
        int dy[]={0,0,1};
        visited[y][x]=true;
        
        
        while(!q.isEmpty()){
            int xyz[]=q.poll();
            
            for(int i=0;i<3;i++){
            	int nx=dx[i]+xyz[0];
                int ny=dy[i]+xyz[1];
                int ncnt=xyz[2];
                if(nx>=0&&nx<100&&ny>=0&&ny<100){
                	if(map[ny][nx]!=0&&!visited[ny][nx]){
                    	visited[ny][nx]=true;
                        q.offer(new int[]{nx,ny,ncnt+1});
                        if(ny==99){
                            if(min>ncnt){
                            	min=ncnt;
                                minIndex=x;
                            }
                        }
                        break;
                    }
                }
            }
             
        }
       
        return;
    }
}