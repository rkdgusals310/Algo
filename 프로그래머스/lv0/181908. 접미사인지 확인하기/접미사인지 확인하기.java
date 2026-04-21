class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len=is_suffix.length();
        int len2=my_string.length();
        if(len>len2)return answer;
        if(my_string.substring(len2-len).equals(is_suffix))answer=1;
        return answer;
    }
}