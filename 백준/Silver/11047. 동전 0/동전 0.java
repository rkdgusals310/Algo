import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int k=s.nextInt();
        int cnt=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            cnt+=k/arr[i];
            k=k%arr[i];
        }
        System.out.print(cnt);
    }
}