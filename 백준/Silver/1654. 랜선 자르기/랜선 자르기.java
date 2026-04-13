import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int k=s.nextInt();
        int n=s.nextInt();
        long lan[]=new long[k];
        long max=0;
        for(int i=0;i<k;i++){
            lan[i]=s.nextInt();
            max=max>lan[i]?max:lan[i];
        }
        long low=1;
        long high=max+1;
        long maxH=0;
        while(low<=high){
            long mid=(low+high)/2;
            long total=0;
            for(int i=0;i<k;i++){
                total+=lan[i]/mid;
            }
            if(total>=n){
                maxH=maxH>mid?maxH:mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.print(maxH);
    }
}