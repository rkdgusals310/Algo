import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().trim();
        String arr[]=str.split(" ");
        String n1="";
        String n2="";
        for(int i=2;i>=0;i--){
            n1+=arr[0].charAt(i);
            n2+=arr[1].charAt(i);
        }
        if(Integer.parseInt(n1)>Integer.parseInt(n2)){System.out.print(n1);}
        else{System.out.print(n2);}
    }
}