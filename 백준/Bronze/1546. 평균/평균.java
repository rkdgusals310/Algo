import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float arr[]=new float[n];
        float max=-1;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(max<arr[i]){max=arr[i];}
        }
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=(arr[i]/max*100);
        }
        System.out.println(sum/n);
    }
}