class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int len=0;
        while(num/10>0){
            if(num%10==k){
                answer=len;
            }
            len++;
            num/=10;
        }
        if(num==k)answer=len;
        answer=answer!=-1?len-answer+1:-1;
        return answer;
    }
}