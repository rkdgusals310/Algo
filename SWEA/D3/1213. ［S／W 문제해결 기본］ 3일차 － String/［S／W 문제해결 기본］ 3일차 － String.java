
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
            
            String s=sc.next();
            String str=sc.next();
            int cnt=0;
            
            while(true){
                int check=str.indexOf(s);
                
                if(check==-1)break;
                
                str=str.substring(check+1);
                cnt++;
            }
            System.out.println("#"+t+" "+cnt);
			

		}
	}
}