import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int cnt=0;
        for(char c:my_string.toCharArray()){
            if(c-'0'>=0&&c-'0'<=9)cnt++;
        }
        int[] answer = new int[cnt];
        int ind=0;
        for(char c:my_string.toCharArray()){
            if(c-'0'>=0&&c-'0'<=9){
                answer[ind]=c-'0';
                ind++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}