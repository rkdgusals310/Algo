import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int cnt=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                cnt++;
                    if(cnt==n2){
                        System.out.println(i); break;
                    }
                if(i==n1&&cnt!=n2){
                    System.out.println(0);
                }
            }
        }
    }
}