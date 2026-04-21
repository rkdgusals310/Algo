import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String a = sc.next();
        
        String ch[]=a.split("");
        for(int i=0;i<a.length();i++){
            char c=ch[i].charAt(0);
            if(c>='A'&&c<='Z'){
                ch[i]=""+(char)(((int)c)+32);
            }
            else{
              ch[i]=""+(char)(((int)c)-32);  
            }
        }
        for(int i=0;i<a.length();i++){
            sb.append(ch[i]);
        }
        System.out.print(sb);
    }
}

// split와 upper -> 근데 당장 기억이 없음 
// 아스키코드를 활용해서 접근