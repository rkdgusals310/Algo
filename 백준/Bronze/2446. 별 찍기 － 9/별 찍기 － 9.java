import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            char ch[]=new char[2*n-1];
            Arrays.fill(ch,' ');
            for(int j=i;j<=2*n-2-i;j++){
                ch[j]='*';
            }
            System.out.println(new String(ch).stripTrailing());
        }
        
        for(int i=0;i<n-1;i++){
            char ch[]=new char[2*n-1];
            Arrays.fill(ch,' ');
            for(int j=n-2-i;j<=n+i;j++){
                ch[j]='*';
            }
            System.out.println(new String(ch).stripTrailing());
        }
    }
}