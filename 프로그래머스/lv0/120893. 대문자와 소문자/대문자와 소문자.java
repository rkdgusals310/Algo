class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        int n=0;
        for(char c:my_string.toCharArray()){
            if(c>96){
                n=c-32;   
            }
            else{
                n=c+32;
            }
            answer.append((char)n);
        }
        
        return answer.toString();
    }
}