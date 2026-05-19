import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
        
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T=10;
		
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
            int breakN=-1;
            for(int i=0;i<100;i++){
            	if(map[0][i]==0)continue;
                visited=new boolean[100][100];
                visited[0][i]=true;
                int dx[]={-1,1,0};
                int dy[]={0,0,1};
                int x=i;
                int y=0;
                while(true){
                    
                	if(y==99){
                        if(map[y][x]==2){
                            sb.append("#"+t+" "+i).append("\n");
                        	breakN=0;
                        }
                    	break;
                    }
                    for(int j=0;j<3;j++){
                    	int nx=dx[j]+x;
                        int ny=dy[j]+y;
                        if(nx>=0&&nx<100&&ny>=0&&ny<100){
                        	if(!visited[ny][nx]&&map[ny][nx]!=0){
                                visited[ny][nx]=true;
                                x=nx;
                                y=ny;
                                break;
                            }
                        }
                    }
                    
                }
                if(breakN==0)break;
            }
            
            

		}
        System.out.print(sb);
	}
}