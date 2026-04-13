import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int loop=s.nextInt();
        int change[]=new int[4];
        int stand[]={25,10,5,1};
        for(int i=0;i<loop;i++){
            int money=s.nextInt();
            
            for(int j=0;j<4;j++){
                change[j]=money/stand[j];
                money%=stand[j];
            }
            for(int j=0;j<4;j++){
                System.out.print(change[j]+" ");
            }System.out.println();
        }
	}
}
