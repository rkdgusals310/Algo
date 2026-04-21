class Solution {
    public String solution(int age) {
        String num=""+age;
        String answer = "";
        for(char c:num.toCharArray()){
            answer+=""+(char)('a'+(c-'0'));
        }
        return answer;
    }
}