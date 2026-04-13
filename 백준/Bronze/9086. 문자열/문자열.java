import java.util.Scanner;
public class Main{
   public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        for(int i=0;i<num;i++){
	            String str=s.next();
	            char start=str.charAt(0);
	            char end=str.charAt(str.length()-1);
	            System.out.print(start);
	            System.out.print(end);
	            System.out.println();
	        }
	    }
}