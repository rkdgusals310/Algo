
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
            String ch[]=str.split("");
            String str2=sc.next();
            String ch2[]=str2.split("");
            
            int start=0;
            int len=str.length();
            int cnt=0;
            
            for(int i=0;i<ch2.length-len+1;i++){
            	int n=0;
                for(String s:ch){
                	if(ch2[i+n].equals(s)){
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