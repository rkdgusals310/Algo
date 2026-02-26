import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int num=1;
        int cnt=1;
        while(true){
            if(n<=num){
                break;
            }num+=6*cnt;cnt++;
        }
        System.out.print(cnt);
    }
}
