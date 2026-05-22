
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
            int max=-1;
            long plus=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=n-1;i>=0;i--){
                if(max>arr[i]){
                	plus+=max-arr[i];
                }
                else{
                	max=arr[i];
                }
            }
            sb.append("#"+test_case+" "+plus).append("\n");
		}System.out.print(sb);
	}
}