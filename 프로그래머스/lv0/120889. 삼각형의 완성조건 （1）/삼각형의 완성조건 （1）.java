class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int sum=0;
        int longN=sides[0];
        for(int i=0;i<sides.length;i++){
            sum+=sides[i];
            longN=longN>sides[i]?longN:sides[i];
        }
        if(longN>=sum-longN)answer=2;
        return answer;
    }
}