import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        
        long tree[]=new long[n];
        long max=0;
        for(int i=0;i<n;i++){
            tree[i]=s.nextInt();
            max=tree[i]>max?tree[i]:max;
        }
        long low=1;
        long high=max+1;
        long h=0;
        while(low<=high){
            
            long mid=(low+high)/2;
            long total=0;
            for(int i=0;i<tree.length;i++){
                total=tree[i]-mid>0?total+tree[i]-mid:total;
            }
            if(total>=m){
                
                if(total>m){h=h>mid?h:mid;low=mid+1;}
                else{h=h>mid?h:mid;break;}
                
            }
            else if(total<m){
                high=mid-1;
            }
            else{
                
            }
            //System.out.println(low+" "+high+" "+total+" "+mid);
        }
        System.out.println(h);
    }
}