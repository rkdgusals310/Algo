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
            
            int startX=0;
            int startY=0;
            
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                    map[i][j]=sc.nextInt();
                	if(map[i][j]==2){
                    	startX=j;
                        startY=i;
                    }
                }
            }
            int dx[]={-1,1,0};
            int dy[]={0,0,-1};
            
            while(true){
                if(startY==0)break;
            	for(int i=0;i<3;i++){
                	int nx=dx[i]+startX;
                    int ny=dy[i]+startY;
                    
                    if(nx>=0&&nx<100&&ny>=0&&ny<100){
                        if(map[ny][nx]!=0){
                        	startX=nx;
                       	 	startY=ny;
                            map[startY][startX]=0;
                        	break;
                        }
                        
                    }
                }
            }
			sb.append("#"+t+" "+startX).append("\n");
		}System.out.print(sb);
	}
}