
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            // 가로 탐색
            // 세로 탐색
            // 3 x 3 구간 탐색
            int map[][]=new int[9][9];
            boolean visited[]=new boolean[10];
			int cnt=1;
            
            for(int i=0;i<9;i++){
            	for(int j=0;j<9;j++){
                	map[i][j]=sc.nextInt();
                }
            }
            // 가로 & 세로 탐색
            for(int i=0;i<9;i++){
                visited=new boolean[10];
            	for(int j=0;j<9;j++){
                	if(!visited[map[i][j]]){
                    	visited[map[i][j]]=true;
                    }
                    else {
                        cnt=0;
                        break;
                    }   
                }
                visited=new boolean[10];
                for(int j=0;j<9;j++){
                	if(!visited[map[j][i]]){
                    	visited[map[j][i]]=true;
                    }
                    else {
                        cnt=0;
                        break;
                    }   
                }
            }
            if(cnt==1){
                for(int k=0;k<3;k++){
                    visited=new boolean[10];
                for(int i=0;i<3;i++){
                	 for(int j=0;j<3;j++){
                			if(!visited[map[i][j+k*3]]){
                                visited[map[i][j+k*3]]=true;
                            }
                            else {
                                cnt=0;
                                break;
                            }   
                     }
                }
                //
                    visited=new boolean[10];
                                for(int i=3;i<6;i++){
                	 for(int j=0;j<3;j++){
                			if(!visited[map[i][j+k*3]]){
                                visited[map[i][j+k*3]]=true;
                            }
                            else {
                                cnt=0;
                                break;
                            }   
                     }
                                }   
                    visited=new boolean[10];
                                    for(int i=6;i<9;i++){
                	 for(int j=0;j<3;j++){
                			if(!visited[map[i][j+k*3]]){
                                visited[map[i][j+k*3]]=true;
                            }
                            else {
                                cnt=0;
                                break;
                            }   
                     }
                                    }
                }

            }
            
            System.out.println("#"+test_case+" "+cnt);

		}
	}
}