import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int cnt[]=new int[10];
        
        String sum=""+(a*b*c);
        for(char ch:sum.toCharArray()){
            cnt[ch-'0']++;
        }
        for(int i=0;i<10;i++){
            sb.append(cnt[i]).append("\n");
        }
        System.out.print(sb);
    }
}