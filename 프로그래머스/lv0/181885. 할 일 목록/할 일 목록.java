class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt=0;
        int start=0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i])cnt++;
        }
        String[] answer = new String[cnt];
        for(int i=0;i<todo_list.length;i++){
            if(!finished[i]){
                answer[start]=todo_list[i];
                start++;
            }
        }
        return answer;
    }
}