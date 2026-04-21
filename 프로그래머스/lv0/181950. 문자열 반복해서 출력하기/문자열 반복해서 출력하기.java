import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String str = sc.next();
        int n = sc.nextInt();
        
        while(true){
            if(str.length()<1||str.length()>10){
                str = sc.next();
                continue;
            }
            if(n<1||n>5){
                n=sc.nextInt();
                continue;
            }
            break;
        }
        for(int i=0;i<n;i++){
            sb.append(str);
        }
        System.out.print(sb);
    }
}