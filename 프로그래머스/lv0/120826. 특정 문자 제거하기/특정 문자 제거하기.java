class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        
        for(char ch:my_string.toCharArray()){
            if(letter.equals(""+ch)){continue;}
            answer.append(ch);
        }
        
        
        return answer.toString();
    }
}