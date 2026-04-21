class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len=is_prefix.length()>my_string.length()?0:is_prefix.length();
        if(len==0)return answer;     
        if(my_string.substring(0,is_prefix.length()).equals(is_prefix))answer=1;     
        return answer;
    }
}