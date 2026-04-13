

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        while(true){
            int max=-1;
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int arr[]={a,b,c};
            int cnt=-1;
            if(a==0&&b==0&&c==0){break;}
            for(int i=0;i<3;i++){
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
            if(sum<=max){
                System.out.println("Invalid");
            }
            else if(a==b&&b==c){
                System.out.println("Equilateral");
            }
            else if(a==b||b==c||c==a){
                System.out.println("Isosceles");
            }
            else if(a!=b&&b!=c&&c!=a){
                System.out.println("Scalene");
            }
            
        }
    }
}