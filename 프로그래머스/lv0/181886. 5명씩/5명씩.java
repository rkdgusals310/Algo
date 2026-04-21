class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length/5+1];
        int start=0;
        for(int i=0;i<names.length;i+=5){
            answer[start]=names[i];
            start++;
        }
        return answer;
    }
}