import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
		for(int test_case = 1; test_case <= 10; test_case++)
        {
            int T=sc.nextInt();
            String s=sc.next();
            String str=sc.next();
            int num=0;
            int cnt=0;
            for(char ch:str.toCharArray()){
            	if(ch==s.charAt(num)){
                    if(num==(s.length()-1)){
                    	num=0;
                        cnt++;
                        continue;
                    }
                    num++;
                }
                else {
                	if(ch==s.charAt(0))num=1;
                    else num=0;
                }
            }
            sb.append("#"+T+" "+cnt).append("\n");
		}
        System.out.print(sb);
	}
}