class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac=1;
        while(n>=fac){
            fac*=answer;
            answer++;
        }
        return answer-2;
    }
}