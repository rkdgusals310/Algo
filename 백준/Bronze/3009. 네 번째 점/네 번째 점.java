import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[3][2];
        int cnt=0;
        int cnt2=0;
        int x=0;
        int y=0;
        for(int i=0;i<3;i++){
                arr[i][0]=s.nextInt();
                arr[i][1]=s.nextInt();
        }
        for(int i=1;i<3;i++){
            if(arr[0][0]==arr[i][0]){
                cnt++;
            }
            else{
                x=arr[i][0];
            }
            if(arr[0][1]==arr[i][1]){
                cnt2++;
            }
            else{
                y=arr[i][1];
            }
        }
        if(cnt==0){
            System.out.print(arr[0][0]);
        }
        else{
             System.out.print(x);
        }
        System.out.print(" ");
        if(cnt2==0){
            System.out.print(arr[0][1]);
        }
        else{
             System.out.print(y);
        }
    }
}