import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int i=0;i<num;i++){
            	arr[i]=sc.nextInt();
            }
            int ok=0;
            for(int i=2;i<num-2;i++){
                int temp[]={arr[i-2],arr[i-1],arr[i+1],arr[i+2]};
                Arrays.sort(temp);
                if(arr[i]>temp[3]){
                	ok+=(arr[i]-temp[3]);
                }
            }
            
            System.out.println("#"+test_case+" "+ok);
		}
	}
}