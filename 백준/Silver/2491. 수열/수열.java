import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int arr[]=new int[n+1];
        int dpIncrease[]=new int[n+1];
        int dpDecrease[]=new int[n+1];
        Arrays.fill(dpIncrease,1);
        Arrays.fill(dpDecrease,1);
        for(int i=1;i<=n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=2;i<arr.length;i++){
           
            if(arr[i]>=arr[i-1]){dpIncrease[i]=dpIncrease[i]>dpIncrease[i-1]+1?dpIncrease[i]:dpIncrease[i-1]+1;}
            if(arr[i]<=arr[i-1]){dpDecrease[i]=dpDecrease[i]>dpDecrease[i-1]+1?dpDecrease[i]:dpDecrease[i-1]+1;}

        }
        int max=dpIncrease[1];
        for(int i=2;i<arr.length;i++){
            max=max>dpIncrease[i]?max:dpIncrease[i];
        }
        for(int i=1;i<arr.length;i++){
            max=max>dpDecrease[i]?max:dpDecrease[i];
        }
        System.out.print(max);
        
    }
   
}