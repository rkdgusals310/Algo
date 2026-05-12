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