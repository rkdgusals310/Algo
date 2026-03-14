import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        
        System.out.print(fac(n));
    }
    public static int fac(int n){
        if(n<=1){return 1;}
        return n*fac(n-1);
    }
}