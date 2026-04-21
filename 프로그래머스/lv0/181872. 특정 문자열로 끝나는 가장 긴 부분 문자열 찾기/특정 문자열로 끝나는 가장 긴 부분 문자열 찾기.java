class Solution {
    public String solution(String myString, String pat) {
        String answer ="";
        int start=0;
        int end=pat.length()-1;
        int temp=0;
        while(end!=myString.length()){
            if(pat.equals(myString.substring(start,end+1))){
                temp=end;
            }
            start++;
            end++;
        }
        
        answer=myString.substring(0,temp+1);
        return answer;
    }
}