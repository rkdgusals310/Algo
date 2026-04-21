class Solution {
    public int solution(int a, int b) {
        int answer = a*b*2;
        answer=answer>Integer.parseInt(""+a+b)?answer:Integer.parseInt(""+a+b);
        return answer;
    }
}