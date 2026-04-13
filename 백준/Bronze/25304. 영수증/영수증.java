import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int price=s.nextInt();
        int num=s.nextInt();
        for(int i=0;i<num;i++){
            int n1=s.nextInt();
            int n2=s.nextInt();
            price-=(n1*n2);
        }
        if(price==0){System.out.print("Yes");}
        else{System.out.print("No");}
    }
}