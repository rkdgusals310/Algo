import java.util.*;

//기본 판별법
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=s.nextInt();
            if(decimal(num[i])){cnt++;}
        }
        System.out.println(cnt);
    }
    public static boolean decimal(int num){
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false; // 소수는 1과 자신을 제외한 약수가 존재하면 안된다.
        }
        return true;
        
    }
}