import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x=s.nextInt();
        boolean num[]=new boolean[x];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(x-arr[i]>0){
                if(num[x-arr[i]])cnt++;
                num[arr[i]]=true; 
            }
            
            
        }
        System.out.println(cnt);
        
    }
}