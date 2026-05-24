import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        String str="";

        if(n<80){
            str+=(80-n)+" more score";
        }
        else str="pass";
        System.out.print(str);
    }
}