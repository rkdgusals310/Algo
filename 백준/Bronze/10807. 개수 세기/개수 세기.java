import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[201];
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            arr[num+100]++;
        }
        
        int v=s.nextInt();
        System.out.print(arr[v+100]);
    }
}