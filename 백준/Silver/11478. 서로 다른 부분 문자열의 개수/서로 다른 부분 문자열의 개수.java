import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Set<String> set=new HashSet<>();
        String str=s.next();
        int len=str.length();
        int test=len;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                String tmp=str.substring(i,j+1);
                set.add(tmp);
                
            }
        }
        System.out.print(set.size());
    }
}