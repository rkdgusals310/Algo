import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int j=0;j<m;j++){
            int x=s.nextInt();
            int y=s.nextInt();
            int temp[]=new int[y-x+1];
            int len=0;
            for(int k=y;k>=x;k--){
                temp[len]=arr[k-1];
                len++;
            }
            len=0;
            for(int h=x;h<=y;h++){
                arr[h-1]=temp[len];
                len++;
            }
           
        }
        for(int q=0;q<arr.length;q++){
            System.out.print(arr[q]+" ");
        }
    }
}