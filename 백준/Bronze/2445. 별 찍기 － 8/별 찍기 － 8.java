import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int current=1;
        top(n,current);
        bottom(n,current);
    }
    public static void top(int n,int current){
        if(n==0){return;}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<current;i++){
            sb.append("*");
        }
        for(int i=0;i<2*(n-1);i++){
            sb.append(" ");
        }
        for(int i=0;i<current;i++){
            sb.append("*");
        }
        current++;
        System.out.println(sb);
        top(n-1,current);
    }
    public static void bottom(int n,int current){
        if(n==1){return;}
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            sb.append("*");
        }
        for(int i=0;i<2*current;i++){
            sb.append(" ");
        }
        for(int i=0;i<n-1;i++){
            sb.append("*");
        }
        current++;
        System.out.println(sb);
        bottom(n-1,current);
    }
}