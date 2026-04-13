import java.util.*;

public class Main{
    public static long newNum=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String str="";
        long n=s.nextLong();
        long start=n;
        int cnt=0;
        if(start<10){
             System.out.print(start);
             return;
        }
        while(true){
            if(n<10){
                break;
            }
            n=n/10;
            cnt++;
        }
        num(start,cnt);
        System.out.print(newNum);
    }
    public static void num(long n,int cnt){
        if(cnt==0){
            newNum+=9;
            return;
        }
        //int n2=n-((int)Math.pow(10,cnt)-1);
        long base = 1;
        for (int i = 0; i < cnt; i++) base *= 10;
        long n2 = n - (base - 1);
        newNum+=n2*(cnt+1);
        num(n-n2,cnt-1);
    }
}
