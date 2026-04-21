class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int start=0;
        int end=pat.length()-1;
        
        while(end!=myString.length()){
            if(pat.equals(myString.substring(start,end+1)))answer++;
            start++;
            end++;
        }
        
        return answer;
    }
}