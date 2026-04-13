

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String test1[]=str1.split("");
		String str2=s.next();
		String test2[]=str2.split("");
		
		String str3=s.next();
		String test3[]=str3.split("");
		
		String str4=s.next();
		String test4[]=str4.split("");
		
		String str5=s.next();
		String test5[]=str5.split("");
		int len[]= {test1.length,test2.length,test3.length,test4.length,test5.length};
		int max=0;
		for(int i=0;i<5;i++) {
			if(len[i]>max) {
				max=len[i];
			}
		}
		
			for(int j=0;j<max;j++) {
				if(j<test1.length) {System.out.print(test1[j]);}
				if(j<test2.length) {System.out.print(test2[j]);}
				if(j<test3.length) {System.out.print(test3[j]);}
				if(j<test4.length) {System.out.print(test4[j]);}
				if(j<test5.length) {System.out.print(test5[j]);}
		}
	}
}
