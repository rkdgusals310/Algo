import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        if(num>89){System.out.print('A');}
        else if(num>79){System.out.print('B');}
        else if(num>69){System.out.print('C');}
        else if(num>59){System.out.print('D');}
        else{System.out.print('F');}
    }
}