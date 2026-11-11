import java.util.Scanner;
import java.io.FileInputStream;


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
            int arr[][]=new int[100][100];
            int y=0;
            int x=99;
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                	arr[i][j]=sc.nextInt();
                    if(arr[i][j]==2)y=j;
                }
            }
            int dx[]={0,0,-1};
            int dy[]={-1,1,0};
            int nx=x;
            int ny=y;
            arr[nx][ny]=0;
             while(true){
             	if(x==0){
                	break;
                }

                for(int i=0;i<3;i++){
                	nx=x+dx[i];
                    ny=y+dy[i];
                    if(nx>=0&&nx<100&&ny>=0&&ny<100){
                        if(arr[nx][ny]!=0){
                            arr[nx][ny]=0;
                        	x=nx;
                        	y=ny;
                        	break;
                        }
                    	
                    }
                }
             }
            System.out.println("#"+test_case+" "+y);
		}
	}
}