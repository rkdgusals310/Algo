import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        long a=s.nextLong();
        long b=s.nextLong();
        long temp=a;
        if(a>b){
            a=b;
            b=temp;
        }
        // a와b가 같은 경우도 고려했어야했는데 그러지 못해서 계속 틀렸던 문제
        sb.append(Math.max(b-a-1,0)).append("\n");
        for(long i=a+1;i<b;i++){
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
}