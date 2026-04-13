import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String number=s.next();
        int cnt[]=new int[9];
        
        for(char c:number.toCharArray()){
            cnt[(c-'0')==9?6:c-'0']++;
        }
        int max=cnt[0];
        cnt[6]=cnt[6]%2==0?cnt[6]/2:cnt[6]/2+1;
        for(int i=1;i<9;i++){
            max=cnt[i]>max?cnt[i]:max;
        }
        System.out.print(max);
    }
}