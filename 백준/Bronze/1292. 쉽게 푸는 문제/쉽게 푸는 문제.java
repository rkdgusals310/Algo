import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int cnt=0;
        int sum=0;
        int start=1;
        for(int i=0;i<b;i++){
            for(int j=0;j<start;j++){
                cnt++;
                if(cnt>=a&&cnt<=b)sum+=start;
            }start++;
        }
 
        System.out.print(sum);
    }
}