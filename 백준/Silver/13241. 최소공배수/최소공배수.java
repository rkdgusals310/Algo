import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n1=s.nextLong();
		long n2=s.nextLong();
		int len=(int) (n1>n2?n2:n1);
		long total=1;
		for(int i=2;i<=len;) {
			if(n1%i!=0||n2%i!=0) {
				i++;
			}
			else {
				total*=i;
				n1/=i;
				n2/=i;
			}
		}
		total=total*n1*n2;
		System.out.println(total);
	}
}
