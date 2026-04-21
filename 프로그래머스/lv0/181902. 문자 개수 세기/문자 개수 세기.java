class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char c:my_string.toCharArray()){
            int num=c-'A';
            num=c>='a'?c-'a'+26:num;
            answer[num]++;
        }
        // 65 97 90~96 7
        
        return answer;
    }
}

 