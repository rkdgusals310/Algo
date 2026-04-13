import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();//2n-1의 형태
        String str=" ".repeat(n);
        
        for(int i=1;i<n+1;i++){  
            System.out.println(str.substring(i)+"*".repeat(2*i-1));
        }
    }
}