
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
			int num[][]=new int[100][100];
            
            for(int i=0;i<100;i++){
            	for(int j=0;j<100;j++){
                	num[i][j]=sc.nextInt();
                }
            }
            int row=0;
            int col=0;
            int max=0;
            int cro1=0;
            int cro2=0;
            
             for(int i=0;i<100;i++){
                 row=0;
                 col=0;
            	for(int j=0;j<100;j++){
                	row+=num[i][j];
                    col+=num[j][i];
                }
                max=max>row?max:row;
                max=max>col?max:col;
                cro1+=num[i][i];
                cro2+=num[i][99-i];
            }
            max=max>cro1?max:cro1;
            max=max>cro2?max:cro2;
            
			System.out.println("#"+t+" "+max);
		}
	}
}