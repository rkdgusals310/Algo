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
            int t=sc.nextInt();
            int num[]=new int[101];
            for(int i=0;i<1000;i++){
            	num[sc.nextInt()]++;
            }
            int max=0;
            int index=0;
            for(int i=0;i<101;i++){
            	if(num[i]>max){
                	index=i;
                    max=num[i];
                }
                else if(num[i]==max){
                	index=i;
                }
            }
            System.out.println("#"+t+" "+index);
		}
	}
}