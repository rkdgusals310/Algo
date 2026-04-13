
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<num+1;i++){
            int n1=s.nextInt();
            int n2=s.nextInt();
            System.out.println("Case #"+i+": "+n1+" + "+n2+" = "+(n1+n2));
        }
    }
}