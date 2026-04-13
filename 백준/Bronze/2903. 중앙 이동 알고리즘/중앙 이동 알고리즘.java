

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=4;
        for(int i=1;i<n+1;i++){
            int total=(int)(Math.pow(2,i-1))*(int)((Math.pow(2,i-1)+1))+(int)((Math.pow(2,i)+1))*(int)(Math.pow(2,i-1));
            sum+=total;
           
        }
        System.out.print(sum);
        
    }
}
