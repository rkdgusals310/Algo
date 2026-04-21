class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length+1-n];
        int start=0;
        for(int i=n-1;i<num_list.length;i++){
            answer[start]=num_list[i];
            start++;
        }
        
        
        
        return answer;
    }
}