import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        for(int i=0;i<num;i++){
	            int n=s.nextInt();
	            String str=s.next();
	            for(int j=0;j<str.length();j++){
	                for(int k=0;k<n;k++){
	                    System.out.print(str.charAt(j));
	                }
	                
	            }System.out.println();
	        }
	    }
}