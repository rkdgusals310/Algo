import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int n=s.nextInt();
        int m=s.nextInt();
        
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            if(num<m)sb.append(num).append(" ");
        }
        System.out.print(sb);
    }
}