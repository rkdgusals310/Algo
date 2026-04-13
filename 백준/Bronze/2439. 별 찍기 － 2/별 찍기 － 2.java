import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                sb.append(" ");
            }
            for(int j=0;j<i+1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}