import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
			
			long profit=0;
			for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            int max=Collections.max(list);
            for(int i=0;i<n;i++){
                if(max>list.get(i)){
                	profit+=max-list.get(i);
                }
                
                if(max==list.get(i)){list.set(i,0);max=Collections.max(list);}
                list.set(i,0);
            }
            sb.append("#"+test_case+" ").append(profit).append("\n");
            
            
		}
        System.out.print(sb);
	}
}