

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[9][9];
		int max=-1;
		int x = 0,y=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=s.nextInt();
				if(max<arr[i][j]) {
					x=i+1;y=j+1;
					max=arr[i][j];
				}
			}
		}	
		System.out.println(max);
		System.out.println(x+" "+y);
	}
}
