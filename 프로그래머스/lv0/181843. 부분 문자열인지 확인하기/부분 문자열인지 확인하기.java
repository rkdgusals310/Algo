class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int len=target.length();
        for(int i=0;i<my_string.length()-len+1;i++){
            if(target.equals(my_string.substring(i,len+i))){
                answer=1;
                break;
            }
        }
        return answer;
    }
}