
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
            String str=sc.next();
            String str2=sc.next();

            int len=str.length();
            int cnt=0;
            
            for(int i=0;i<=str2.length()-len;i++){
            	int n=0;
                for(char s:str.toCharArray()){
                	if(str2.charAt(i+n)==s){
                    	n++;
                        if(n==len)cnt++;
                    }
                    else{
                    	break;
                    }
                }
            }

            System.out.println("#"+t+" "+cnt);
		}
	}
}