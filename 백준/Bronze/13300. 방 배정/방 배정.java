import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int boys[]=new int[6];
        int girls[]=new int[6];
        for(int i=0;i<n;i++){
            int sex=s.nextInt();
            int y=s.nextInt();
            switch(sex){
                case 0:
                    girls[y-1]++;
                    break;
                case 1:
                    boys[y-1]++;
                    break;
            }
        }
        int totalRoom=0;
         for(int i=0;i<6;i++){
               if(girls[i]%k==0){
                   totalRoom+=girls[i]/k;
               }
             else{
                 totalRoom+=girls[i]/k+1;
             }  
             
         }
        for(int i=0;i<6;i++){
               if(boys[i]%k==0){
                   totalRoom+=boys[i]/k;
               }
             else{
                 totalRoom+=boys[i]/k+1;
             }  
             
         }
        System.out.print(totalRoom);
    }
}