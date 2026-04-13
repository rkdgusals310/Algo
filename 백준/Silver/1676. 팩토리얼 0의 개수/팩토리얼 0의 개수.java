import java.util.Scanner;
public class Main{
    public static void main(String args[]){ 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
            while(true){
                if(n/5>0){cnt+=n/5;n/=5;}
                else{break;}
            }
            System.out.print(cnt);

        
    }
}