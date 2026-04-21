class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i=0;i<3;i++){
            if(date1[i]==date2[i]){
                continue;
            }
            else if(date1[i]<date2[i]){answer=1;break;}
            else{
                answer=0;
                break;
            }
        }
        return answer;
    }
}