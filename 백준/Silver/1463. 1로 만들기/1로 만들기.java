import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.print(dp(n,arr));
    }
    public static int dp(int n,int arr[]){
        if(arr[n]!=0)return arr[n];
        if(n==1)return arr[1]=0;
        if(n<4)return arr[n]=1;
        
        arr[n]=dp(n-1,arr);
        if(n%2==0)arr[n]=arr[n]>dp(n/2,arr)?dp(n/2,arr):arr[n];
        if(n%3==0)arr[n]=arr[n]>dp(n/3,arr)?dp(n/3,arr):arr[n];
        
        return arr[n]=arr[n]+1;
    }
}