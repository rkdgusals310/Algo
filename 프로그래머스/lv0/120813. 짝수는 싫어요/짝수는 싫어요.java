class Solution {
    public int[] solution(int n) {
        int len=n%2==0?n:n+1;
        int num=1;
        int[] answer = new int[len/2];
        for(int i=0;i<len/2;i++){
            answer[i]=num;
            num+=2;
        }
        return answer;
    }
}