// split 활용
// 10으로 나누는 방법
class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n/10>0){
            answer+=n%10;
            n/=10;
        }
        return answer+n;
    }
}