class Solution {
    public int solution(int price) {
        float answer = 1;
        if(price>=500000) answer=0.8f;
        else if(price>=300000)answer=0.9f;
        else if(price>=100000)answer=0.95f;
        return (int)(answer*price);
    }
}