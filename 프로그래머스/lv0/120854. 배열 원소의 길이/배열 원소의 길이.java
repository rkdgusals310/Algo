/*
    strlist 
    각 원소의 길이를 담은 배열을 리턴
*/
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0;i<strlist.length;i++){
            if(strlist[i]==null)continue;
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}