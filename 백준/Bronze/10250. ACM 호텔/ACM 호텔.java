import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            int room=s.nextInt();
            if(room%n==0){
                sb.append(n*100+room/n).append("\n");
            }
            else{
                sb.append(room%n*100+room/n+1).append("\n");
            }
            
        }System.out.print(sb);
    }
}