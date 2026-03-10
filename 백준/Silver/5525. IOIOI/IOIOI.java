import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int cnt=0;
        String str="IOI";
        for(int i=1;i<n;i++){
            str+="OI";
        }
        
        String s=sc.next();

        for(int i=0;i<=m-str.length();i++){
            if(s.substring(i,i+str.length()).equals(str))cnt++;
        }
        
        System.out.print(cnt);
    }
}