import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        Set<Integer> a=new HashSet<>();

        
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            a.add(num);
        }
        int size=a.size();
        int cnt=0;
        for(int i=0;i<m;i++){
            int num=s.nextInt();
            a.add(num);
            if(a.size()==size) {
            	cnt++;
            }
            else {
            	a.remove(num);
            }
        }
        System.out.println(n+m-cnt*2);
    }
}