
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextInt();
		int cnt=0;
		long start=0;
		long nn=1;
		int i=0;
		while(true) {
			start=nn+6*i;
			nn=start;
			i++;
			if(start>=n||n==1) {System.out.println(i);break;}
		}
	}
}
