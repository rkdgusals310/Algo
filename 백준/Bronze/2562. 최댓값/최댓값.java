import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[9];
        int index=0;
        int max=-1;
        
        for(int i=0;i<9;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<9;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}