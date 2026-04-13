import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int m=s.nextInt();
        int n=s.nextInt();
        int snack[]=new int[n];
        int maxLen=0;
        for(int i=0;i<n;i++){
            snack[i]=s.nextInt();
            maxLen=snack[i]>maxLen?snack[i]:maxLen;
        }
        Arrays.sort(snack);
        int low=1;
        int high=maxLen;
        int max=0;
        while(low<=high){
            int cnt=0;
            int mid=(low+high)/2;
            for(int i=0;i<n;i++){
                if(snack[i]/mid>=1){
                    cnt+=snack[i]/mid;
                }
            }
            if(cnt>=m){
                low=mid+1;
                max=mid;
            }
            else{
                high=mid-1;
            }
        }
        System.out.print(max);
    }
}