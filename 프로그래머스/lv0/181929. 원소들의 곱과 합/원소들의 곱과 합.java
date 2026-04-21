class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul=1;
        int squ=0;
        for(int i=0;i<num_list.length;i++){
            mul*=num_list[i];
            squ+=num_list[i];
        }
        if(Math.pow(squ,2)>mul)answer=1;
        return answer;
    }
}