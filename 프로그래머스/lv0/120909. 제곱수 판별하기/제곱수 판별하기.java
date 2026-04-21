// 그냥 n까지 나누어 보면될듯한데?

class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i=1;i<n;i++){
            if(n==i*i){
                answer=1;
            }
        }
        return answer;
    }
}