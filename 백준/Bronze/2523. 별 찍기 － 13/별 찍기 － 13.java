import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int current=1;
        top(n,current);
        bottom(n);
    }
    public static void top(int n,int current){
        StringBuilder sb=new StringBuilder();
        if(n==0){return;}
        for(int i=0;i<current;i++){
            sb.append("*");
        }
        current++;
        System.out.println(sb);
        top(n-1,current);
    }
    public static void bottom(int n){
        StringBuilder sb=new StringBuilder();
        if(n==1){return;}
        for(int i=0;i<n-1;i++){
            sb.append("*");
        }
        System.out.println(sb);
        bottom(n-1);
    }
}