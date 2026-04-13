import java.util.*;
public class Main{
    public static void main(String arsg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        String str[]=s.next().split("");
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(str[i]);
        }
        System.out.print(sum);
    }
}