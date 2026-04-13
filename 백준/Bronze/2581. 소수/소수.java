

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int sum=0;
        int min=10000;
        for(int i=m;i<=n;i++){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
                if(cnt>2){break;}
                
            }
            if(cnt==2){
                sum+=i;
                if(min>i){min=i;}
            }
        }
        if(sum==0){
            System.out.println(-1);
       
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
}