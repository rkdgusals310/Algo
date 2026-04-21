import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="even";
        while(true){
            if(n<1||n>1000){
                n=sc.nextInt();
                continue;
            }
            if(n%2!=0){str="odd";}
            break;
        }
        System.out.print(n+" is "+str);
    }
}