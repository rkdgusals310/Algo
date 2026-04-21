import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len=a.length();
        if(len>=1&&len<=1000000){
            System.out.print(a);
        }
        else{
            System.out.print("문자열의 길이를 확인해주세요");
        }
        
    }
}