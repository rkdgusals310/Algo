import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		StringBuilder sb=new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int arr[][]=new int[n][2];
            for(int i=0;i<n;i++){
            	arr[i][0]=sc.nextInt(); // 걸리는 시간
                arr[i][1]=sc.nextInt(); // 데드 라인
            }
            Arrays.sort(arr,(a,b)->
            	Integer.compare(a[1],b[1])
            );
            int total=Integer.MAX_VALUE;
            for(int i=arr.length-1;i>=0;i--){
            	total=Math.min(total,arr[i][1]);
                total-=arr[i][0];
            }
            total=total==0?0:total;
            sb.append(total).append("\n");

		}
        System.out.print(sb);
	}
}