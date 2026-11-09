
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;


		for(int test_case = 1; test_case <= T; test_case++)
		{
            int dump=sc.nextInt();
            int block[]=new int[100];
            for(int i=0;i<100;i++){
            	block[i]=sc.nextInt();
            }
            
            Arrays.sort(block);
            for(int i=0;i<dump;i++){
            	block[99]--;
                block[0]++;
                Arrays.sort(block);
            }
            System.out.println("#"+test_case+" "+(block[99]-block[0]));
		}
	}
}