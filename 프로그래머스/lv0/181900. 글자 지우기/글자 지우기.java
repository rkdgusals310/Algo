import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int cnt=0;
        
        Arrays.sort(indices);
        for(int i=0;i<my_string.length();i++){
            if(cnt<indices.length&&indices[cnt]==i){
                cnt++;
                continue;
            }
            answer+=""+my_string.charAt(i);
        }

        
        return answer;
    }
}