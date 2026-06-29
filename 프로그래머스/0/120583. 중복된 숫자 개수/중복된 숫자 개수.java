class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i:array)answer=i==n?answer+1:answer;
        
        return answer;
    }
}