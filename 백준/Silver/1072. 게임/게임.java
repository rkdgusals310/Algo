import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int x=s.nextInt();
        int y=s.nextInt();
        int winRate=(int)(y*100.0/x);
        
        int low=1;
        int high=1_000_000_000;
        long result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int rate=(int)((y+mid)*100.0/(x+mid));
            if(winRate>=rate){
                low=mid+1;
            }
            else{
                high=mid-1;
                result=mid;
            }
        }
        System.out.print(result);
    }
}