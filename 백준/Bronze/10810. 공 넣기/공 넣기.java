import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int basket[]=new int[n];
        for(int i=0;i<m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            int z=s.nextInt();
            for(int j=x;j<=y;j++){
                basket[j-1]=z;
            }
        }
        for(int j=0;j<basket.length;j++){
            System.out.print(basket[j]+" ");
        }
    }
}