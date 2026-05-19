import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int box[]=new int[100];
            int answer=0;
            int tump=sc.nextInt();
            for(int i=0;i<box.length;i++){
            	box[i]=sc.nextInt();
            }
            
            while(tump!=0){
                Arrays.sort(box);
                if(box[0]<box[box.length-1]){
                	box[0]+=1;
                    box[box.length-1]-=1;
                }
                else break;
                tump--;
                
            }
            Arrays.sort(box);
            answer=box[box.length-1]-box[0];
            
            sb.append("#"+test_case+" "+(answer)).append("\n");
		}
        System.out.println(sb);
	}
}