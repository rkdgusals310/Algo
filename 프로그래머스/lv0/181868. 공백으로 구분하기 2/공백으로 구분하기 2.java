import java.util.*;
class Solution {
    public List<String> solution(String my_string) {
        List<String> answer=new ArrayList<>();
        String str[]=my_string.split(" ");
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("")){
                answer.add(str[i]);
            }
        }
        return answer;
    }
}