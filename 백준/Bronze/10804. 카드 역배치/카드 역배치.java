/*
    카드 역배치
    
*/
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[21];
        for(int i=1;i<21;i++){
            arr[i]=i;
        }
        for(int t=0;t<10;t++){
            int a=s.nextInt();
            int b=s.nextInt();
            swap(a,b,arr);
        }
        for(int i=1;i<21;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int a,int b,int arr[]){
        
        for(int i=a;i<=a+(b-a)/2;i++){
            int temp=arr[i];
            arr[i]=arr[a+b-i];
            arr[a+b-i]=temp;
        }

    }
}