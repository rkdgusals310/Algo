import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[3];
        int max=-1;
        int cnt=-1;
        for(int i=0;i<3;i++){
            arr[i]=s.nextInt();
            if(max<arr[i]){
                max=arr[i];
                cnt=i;
            }
        }
        int sum=0;
        for(int i=0;i<3;i++){
            if(i!=cnt){
                sum+=arr[i];
            }
        }
        if(max<sum){
            System.out.print(sum+max);
        }
        else{
            System.out.print(2*sum-1);
        }
    }
}