class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        for(int i=0;i<answer.length-1;i++){
            answer[i]=num_list[i];
        }
        int num=answer[num_list.length-1]*2;
        if(answer[num_list.length-1]>answer[num_list.length-2])num=answer[num_list.length-1]-answer[num_list.length-2];
        answer[num_list.length]=num;
        return answer;
    }
}