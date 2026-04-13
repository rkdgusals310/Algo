import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            int n1=s.nextInt();
            int n2=s.nextInt();if(n1==0&&n2==0){break;}
            System.out.println(n1+n2);
            
            
        }
    }
}