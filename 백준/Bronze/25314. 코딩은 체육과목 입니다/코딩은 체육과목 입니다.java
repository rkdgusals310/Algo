import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String str ="";
        for(int i=0;i<num/4;i++){
            str+="long ";
        }
        System.out.print(str+"int");
        
        
    }
}