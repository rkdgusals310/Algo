import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T=10;
        

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int h=sc.nextInt();
            int totalView=0;
            int []buildings=new int[h];
            for(int i=0;i<h;i++){
            	buildings[i]=sc.nextInt();
            }
            

            for(int i=2;i<h-2;i++){
                 if(buildings[i]>buildings[i-1]&&buildings[i]>buildings[i-2]&&buildings[i]>buildings[i+1]&&buildings[i]>buildings[i+2]){
                     int r1=buildings[i]-buildings[i+1];
                     int r2=buildings[i]-buildings[i+2];
                     int l1=buildings[i]-buildings[i-1];
                     int l2=buildings[i]-buildings[i-2];
                     int r=r1>r2?r2:r1;
                     int l=l1>l2?l2:l1;
                     totalView+=r>l?l:r;
                     
                 }
            }
			sb.append("#"+test_case+" "+totalView).append("\n");
		}
        System.out.print(sb);
	}
}