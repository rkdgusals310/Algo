class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int str1=Integer.parseInt(""+a+b);
        int str2=Integer.parseInt(""+b+a);
        
        answer=str1>str2?str1:str2;
        return answer;
    }
}