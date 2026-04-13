import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        for(int i=0;i<m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            int temp=0;
            temp=arr[x-1];
            arr[x-1]=arr[y-1];
            arr[y-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}