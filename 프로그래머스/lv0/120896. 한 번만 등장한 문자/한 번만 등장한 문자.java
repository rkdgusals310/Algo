class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int alpha[]=new int[26];
        for(char c:s.toCharArray()){
            alpha[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(alpha[i]==1){answer.append((char)('a'+i));}
        }
        
        
        
        return answer.toString();
    }
}