import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        int x=s.nextInt();
	        int sum=0;
	        int cnt=0;
	        for(int i=1;;i++){
	            
	            if(x<=sum){cnt=i-1;break;}
	            sum+=i;
	        }
	        
	      
	        
	        if(cnt%2==0) {
	        	int start=sum-cnt;
		        int top=x-start;
		        int bottom=cnt-(x-start-1);
		        System.out.print(top+"/"+bottom);
	        }
	        else {
	        	int start=sum-cnt;
		        int top=cnt-(x-start-1);
		        int bottom=x-start;
		        System.out.print(top+"/"+bottom);
	        }

	    }
}