import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        s.nextLine();
        int cnt=0;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<n;i++){
           hs.add(s.nextLine());
        }
        for(int i=0;i<m;i++){
            String str=s.nextLine();
            if(hs.contains(str)){cnt++;}
        }
        System.out.print(cnt);
        
    }
}