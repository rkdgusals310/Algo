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
            int map[][]=new int[100][100];
            int min=Integer.MAX_VALUE;
            int minIndex=0;

            for(int i=0;i<map.length;i++){
                for(int j=0;j<map[i].length;j++){
                    map[i][j]=sc.nextInt();
                }
            }

            for(int j=0;j<map[0].length;j++){
                if(map[0][j]==1){
                    int searchN=search(0,j,map);
                    if(min>=searchN){
                        min=searchN;
                        minIndex=j;
                    }
                }
            }
            System.out.println("#"+t+" "+minIndex);
        }
    }
    public static int search(int x,int y,int map[][]){
        int dx[]={0,0,1};
        int dy[]={-1,1,0};
        int cnt=0;

        while(true){
            if(x==99){
                break;
            }
           for(int i=0;i<3;i++){
                int nx=dx[i]+x;
                int ny=dy[i]+y;

                if(nx>=0&&nx<100&&ny>=0&&ny<100){
                    if(map[nx][ny]==1){
                        cnt++;
                        x=nx;
                        y=ny;
                        if(i!=2){
                        	while(true){
                                ny=dy[i]+y;
                                if(dy[i]+y>=100||dy[i]+y<0)break;
                                if (map[x][ny] == 0) break;
                            	ny=dy[i]+y;
                                y=ny;
                                cnt++;
                            }
                            x++;
                            cnt++;
                        }break;
                    }

                }
            }
        }
		 return cnt;
    }
   
}