import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int total=0;
		float sum=0;
		for(int i=0;i<20;i++) {
			String title=s.next();
			float stand=s.nextFloat();
			String score=s.next();
			if(score.equals("P")) {}
			else {total+=stand;}
			
			
			switch (score) {
			case "A+":
				sum+=4.5*stand;
				break;
			case "A0":
				sum+=4.0*stand;
				break;
			case "B+":
				sum+=3.5*stand;
				break;
			case "B0":
				sum+=3.0*stand;
				break;
			case "C+":
				sum+=2.5*stand;
				break;
			case "C0":
				sum+=2.0*stand;
				break;
			case "D+":
				sum+=1.5*stand;
				break;
			case "D0":
				sum+=1.0*stand;
				break;
			case "F":
				sum+=0.0*stand;
				break;
			case "P":
				break;

			default:
				break;
			}
		}
		System.out.printf("%.6f",sum/total);
	}
}
