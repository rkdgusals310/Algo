import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int totalMax=0;
            int rowMax=0;
            int colMax=0;
            int cross1=0;
            int cross2=0;
            int arr[][]=new int[100][100];
            int t=sc.nextInt();
            // 입력 및 행 합
            for(int i=0;i<100;i++){
                int sum=0;
            	for(int j=0;j<100;j++){
                	arr[i][j]=sc.nextInt();
                    sum+=arr[i][j];
                }
                colMax=colMax>sum?colMax:sum;
            }
            totalMax=colMax;
          
            //열 합
            for(int i=0;i<100;i++){
            	int sum=0;
                for(int j=0;j<100;j++){
                    sum+=arr[j][i];
                }
                rowMax=rowMax>sum?rowMax:sum;
            }
            totalMax=totalMax>rowMax?totalMax:rowMax;
			
            // 대각선 계산1,2
            for(int i=0;i<100;i++){
            	 cross1+=arr[i][i];
                 cross2+=arr[i][99-i];
            }
           cross1=cross1>cross2?cross1:cross2;
           totalMax= totalMax>cross1?totalMax:cross1;
           sb.append("#"+test_case+" "+totalMax+"\n");
            
		}
        System.out.print(sb);
	}
}