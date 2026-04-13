import java.util.Scanner;
public class Main{
      public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        while(s.hasNextLine()){
	            String str=s.nextLine();
	            if(str == null || str.trim().isEmpty()) {
	                break;
	            }
	            System.out.println(str);
	        }
	    }
}