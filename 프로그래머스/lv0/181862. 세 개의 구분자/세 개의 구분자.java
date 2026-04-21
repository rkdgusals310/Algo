import java.util.*;

class Solution {
    public List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String str="";
        for(char c:myStr.toCharArray()){
            
            if("abc".contains(""+c)){
                if(!str.equals("")){
                    answer.add(str);
                }
                str="";
            }
            else{
                str+=""+c;
            }
        }
        if(!str.equals("")){
            answer.add(str);
        }
        if(answer.isEmpty())answer.add("EMPTY");
        
        return answer;
    }
}