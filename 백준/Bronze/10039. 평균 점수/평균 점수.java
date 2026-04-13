import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int test[]=new int[5];
        int total=0;
        for(int i=0;i<5;i++){
            test[i]=s.nextInt();
            if(test[i]<40){total+=40;}
            else{total+=test[i];}
        }
        System.out.println(total/5);
    }
}