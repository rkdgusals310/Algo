// 2가지 방법이 떠오른다
// 라이브러리 활용하는 방법과 아스키코드 사용하는 방법;
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char ch=my_string.charAt(i);
            if(my_string.charAt(i)<'a'){
                ch+=32;
            }
            answer+=ch;

        }
        String str[]=answer.split("");
        Arrays.sort(str);
        
        return String.join("",str);
    }
}