import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int n=s.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)sb.append(" ");
            for(int j=0;j<2*i+1;j++)sb.append("*");
            sb.append("\n");
        }
        
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)sb.append(" ");
            for(int j=0;j<2*i-1;j++)sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}