import java.util.*;
class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0;i<s;i++){
            answer+=my_string.charAt(i);
        }
        
        for(int i=0;i<overwrite_string.length();i++){
            answer+=overwrite_string.charAt(i);
        }
        int len=s+overwrite_string.length();
        for(int i=len;i<my_string.length();i++){
            answer+=my_string.charAt(i);
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String str2=s.next();
        int n=s.nextInt();
        System.out.print(solution(str,str2,n));
    }
}