import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0;i<num;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			int len=a>b?b:a;
			int total=1;
			for(int j=2;j<=len;) {
				if(a%j!=0||b%j!=0) {j++;}
				else {
					total*=j;
					a/=j;b/=j;
                    len = a > b ? b : a;
				}
				
			
			}
			total=total*a*b;
			System.out.println(total);

		}
	}
}
