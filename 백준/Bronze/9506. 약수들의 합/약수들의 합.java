
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int sum=0;
        int cnt=0;
        String str="";
        while(true){
            int num=s.nextInt();
            if(num==-1){break;}
            for(int i=1;i<num;i++){
                if(num%i==0){sum+=i;cnt++;}
            }
            if(sum==num){
                System.out.print(num+" = ");
                for(int i=1;i<num;i++){
                if(num%i==0){ 
                    str+=i;
                    if(cnt!=1){
                        str+=" + ";
                        cnt--;
                    }
                    
                }
               
            }
                System.out.println(str);
            }
            else{
                System.out.println(num+" is NOT perfect.");
            }
            sum=0;cnt=0;str="";
        }
       
    }
}