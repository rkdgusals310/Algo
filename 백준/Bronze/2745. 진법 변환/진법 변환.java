import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String num[]=str.split("");
		int n=s.nextInt();
		int total = 0;
		for(int i=0;i<num.length;i++) {
			switch (num[i]) {
			case "A":
				total+=Math.pow(n, num.length-(i+1))*10;
				break;
			case "B":
				total+=Math.pow(n, num.length-(i+1))*11;
				break;
			case "C":
				total+=Math.pow(n, num.length-(i+1))*12;
				break;
			case "D":
				total+=Math.pow(n, num.length-(i+1))*13;
				break;
			case "E":
				total+=Math.pow(n, num.length-(i+1))*14;
				break;
			case "F":
				total+=Math.pow(n, num.length-(i+1))*15;
				break;
			case "G":
				total+=Math.pow(n, num.length-(i+1))*16;
				break;
			case "H":
				total+=Math.pow(n, num.length-(i+1))*17;
				break;
			case "I":
				total+=Math.pow(n, num.length-(i+1))*18;
				break;
			case "J":
				total+=Math.pow(n, num.length-(i+1))*19;
				break;
			case "K":
				total+=Math.pow(n, num.length-(i+1))*20;
				break;
			case "L":
				total+=Math.pow(n, num.length-(i+1))*21;
				break;
			case "M":
				total+=Math.pow(n, num.length-(i+1))*22;
				break;
			case "N":
				total+=Math.pow(n, num.length-(i+1))*23;
				break;
			case "O":
				total+=Math.pow(n, num.length-(i+1))*24;
				break;
			case "P":
				total+=Math.pow(n, num.length-(i+1))*25;
				break;
			case "Q":
				total+=Math.pow(n, num.length-(i+1))*26;
				break;
			case "R":
				total+=Math.pow(n, num.length-(i+1))*27;
				break;
			case "S":
				total+=Math.pow(n, num.length-(i+1))*28;
				break;
			case "T":
				total+=Math.pow(n, num.length-(i+1))*29;
				break;
			case "U":
				total+=Math.pow(n, num.length-(i+1))*30;
				break;
			case "V":
				total+=Math.pow(n, num.length-(i+1))*31;
				break;
			case "W":
				total+=Math.pow(n, num.length-(i+1))*32;
				break;
			case "X":
				total+=Math.pow(n, num.length-(i+1))*33;
				break;
			case "Y":
				total+=Math.pow(n, num.length-(i+1))*34;
				break;
			case "Z":
				total+=Math.pow(n, num.length-(i+1))*35;
				break;
            case "0":
				total+=Math.pow(n, num.length-(i+1))*0;
				break;
			case "1":
				total+=Math.pow(n, num.length-(i+1))*1;
				break;
			case "2":
				total+=Math.pow(n, num.length-(i+1))*2;
				break;
			case "3":
				total+=Math.pow(n, num.length-(i+1))*3;
				break;
			case "4":
				total+=Math.pow(n, num.length-(i+1))*4;
				break;
			case "5":
				total+=Math.pow(n, num.length-(i+1))*5;
				break;
			case "6":
				total+=Math.pow(n, num.length-(i+1))*6;
				break;
			case "7":
				total+=Math.pow(n, num.length-(i+1))*7;
				break;
			case "8":
				total+=Math.pow(n, num.length-(i+1))*8;
				break;
			case "9":
				total+=Math.pow(n, num.length-(i+1))*9;
				break;


			default:
				break;
			}
		}
		System.out.println(total);
		
	}
}
