import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int arr[]={a-x,b-y,x,y};
        int min=9999;
        for(int i=0;i<4;i++){
            if(min>arr[i]){min=arr[i];}
        }
        System.out.print(min);   
    }
}