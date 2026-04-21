class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=1;i<=cipher.length()/code;i++){
            answer.append(cipher.charAt(i*code-1));
        }

        return answer.toString();
    }
}