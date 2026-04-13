import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int h=s.nextInt();
        int m=s.nextInt();
        
        int time=s.nextInt();
        m=m+time;
        if(m>=60){h+=(m/60);m=m%60;}
        if(h>23){h-=24;}
        System.out.println(h+" "+m);
    }
}