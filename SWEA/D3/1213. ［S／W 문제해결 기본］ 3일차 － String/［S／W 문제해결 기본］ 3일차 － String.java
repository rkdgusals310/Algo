
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
            int len=str.length()-1;
            int cnt=0;
            
            for(String s2:ch2){
            	
                if(s2.equals(ch[start])){
                	if(start==len){
                        start=0;
                        cnt++;
                        continue;
                    }
                    start++;
                }
                else{
                	start=0;
                     if(s2.equals(ch[start])){ start++;}
                }
            }

            System.out.println("#"+t+" "+cnt);
		}
	}
}