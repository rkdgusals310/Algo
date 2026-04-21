class Solution {
    public int[] solution(int[] numbers, String direction) {
        int start=1;
        if(direction.equals("right"))start=numbers.length-1;
        int[] answer = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i]=numbers[(start+i)%numbers.length];
        }
        return answer;
    }
}