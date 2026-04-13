import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        System.out.println(fatigue(a,b,c,d));
        
    }
    public static int fatigue(int a,int b,int c,int d){
        int condition=0;
        int workMax=0;
        
        for(int i=0;i<24;i++){
            if(condition+a<=d){
                condition+=a;
                workMax+=b;
                
            }
            else{condition-=c;}
            if(condition<0){condition=0;}
            // System.out.println(condition+" "+workMax);
            
        }
        return workMax;
   
    }

}