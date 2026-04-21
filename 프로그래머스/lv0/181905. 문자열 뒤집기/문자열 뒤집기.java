class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str[]=my_string.split("");
        int len=e-s+1;
        for(int i=0;i<len/2;i++){
            String temp=str[i+s];
            str[i+s]=str[e-i];
            str[e-i]=temp;
        }
        for(int i=0;i<str.length;i++){
            answer+=str[i];
        }
        return answer;
    }
}