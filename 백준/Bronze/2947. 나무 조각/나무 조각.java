import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int num[]={1,2,3,4,5};
        int arr[]=new int[5];
        int temp;
        for(int i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        while(!Arrays.equals(arr,num)){
            for(int i=0;i<4;i++){
                if(arr[i+1]<arr[i]){
                    temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    String str=Arrays.toString(arr).replaceAll("[\\[\\],]","");
                    
                    sb.append(str).append("\n");
                }
            }
            
        }System.out.print(sb);
    }
}