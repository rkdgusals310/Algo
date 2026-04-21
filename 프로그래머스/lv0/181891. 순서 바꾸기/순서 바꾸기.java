class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int start=0;
        for(int i=n;i<num_list.length;i++){
            answer[start]=num_list[i];
            start++;
        }
        for(int i=0;i<n;i++){
            answer[start]=num_list[i];
            start++;
        }
        return answer;
    }
}