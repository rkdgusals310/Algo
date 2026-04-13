import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int arr[]=new int[num];
        int max=-1000000;
        int min=1000000;
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
            if(max<arr[i]){max=arr[i];}
            if(min>arr[i]){min=arr[i];}
        }
        System.out.print(min+" "+max);
    }
}