import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String nn=s.next();
        int start=nn.length()*1;
        int end=nn.length()*9;
        int n=Integer.parseInt(nn);
        int min=0;
        for(int i=start;i<=end;i++){
            int num=n-i;
            int total=num;
            while(true){
                if(num<10){
                    total+=num;
                    break;
                }

                total+=num%10;
                num=num/10;

            }
            if(total==n){
                min=n-i;
            }
        }
        System.out.println(min);
    }
}