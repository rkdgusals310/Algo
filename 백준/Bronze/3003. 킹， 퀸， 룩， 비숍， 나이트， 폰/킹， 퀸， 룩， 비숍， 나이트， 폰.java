import java.util.Scanner;
public class Main{
    public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        int standard[]={1,1,2,2,2,8};
	        int arr[]=new int[6];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=s.nextInt();
	            System.out.print(standard[i]-arr[i]+" ");
	        }
	    }
}