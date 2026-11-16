import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=10;
			

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int t=sc.nextInt();
            int map[][]=new int[100][100];
            boolean visited[][]=new boolean[100][100];
            
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                	map[i][j]=sc.nextInt();
                }
            }
            int min=10001;
            int num=0;
            int index=0;
            for(int i=0;i<100;i++){
                if(map[0][i]==1){
                    visited=new boolean[100][100];
                    num=bfs(0,i,map,visited);
                    if(min>=num){
                    	index=i;
                        min=num;
                    }
                }
                
            }
            System.out.println("#"+t+" "+index);
		}
	}
    public static int bfs(int x,int y, int map[][],boolean visited[][]){
        Queue<int[]> queue=new LinkedList<>();
        
        int count=1;
        int dx[]={0,0,1};
        int dy[]={-1,1,0};
        queue.add(new int[]{x,y,count});
        visited[x][y]=true;
        while(true){
        	if(queue.isEmpty()){   
                break;}
            int xyz[]=queue.poll();
            if(xyz[0]==99){
                count=xyz[2];
            	break;
            }
            for(int i=0;i<3;i++){
            	int nx=xyz[0]+dx[i];
                int ny=xyz[1]+dy[i];
                count=xyz[2];
                if(nx>=0&&nx<100&&ny>=0&&ny<100){
                	if(!visited[nx][ny]&&map[nx][ny]==1){
                        visited[nx][ny]=true;
                    	queue.add(new int[]{nx,ny,count+1});
                        break;
                    }
                     
                }
                
            }
        }
        return count;
    }
}