//해당 문제는 최빈수를 구하는 문제이다.(단 최빈수가 여러개라면 큰 수를 출력하는 문제이다.)
/*
	처음 문제를 읽고 범위가 1000이어서 test_case가 말도안된게 큰 수가 아니라면 
   단순 배열로 문제해결이 가능하다고 생각했다. 
   하지만 여러번 불필요한 반복문이 필요해 최적화된 방법은 아니라고 생각해 
   다른 풀이를 생각하게 되었다.
   -> 1) 제공된 배열을 정렬하고 같은 숫자를 측정하보면 가장 큰수를 찾을 수 있음
   					// 해당 방식이 처음 생각한 방법보다는 쉬운 풀이일듯?
                    

*/

import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		 
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T;
		T=sc.nextInt();
        int size=1000;
		int arr[]=new int[size];	
		for(int test_case = 1; test_case <= T; test_case++)
		{
            
            int max=0;
            int num=0;
            int cnt=0;
            int t=sc.nextInt();
	
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
    		        
            Arrays.sort(arr);
            
            for(int i=1;i<size;i++){
            	
                if(arr[i]==arr[i-1]){
                    cnt++;
                }
                else{
                    if(cnt>=max&&cnt!=0){
                    	max=cnt;
                        num=arr[i-1];
                    }
               		cnt=0;
                }
            }
            if(max==0){
            	num=arr[size-1];
            }
            sb.append("#"+t+" ").append(num).append("\n");
            //System.out.println(Arrays.toString(arr));
		}
        System.out.print(sb);
	}
}