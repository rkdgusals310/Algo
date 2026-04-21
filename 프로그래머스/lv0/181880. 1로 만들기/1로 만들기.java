class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int cnt=0;
        while(true){
            if(cnt==num_list.length)break;
            if(num_list[cnt]==1){
                cnt++;
                continue;
            }
            else if(num_list[cnt]%2!=0){
                num_list[cnt]=(num_list[cnt]-1)/2;
            }
            else{
                num_list[cnt]=num_list[cnt]/2;
            }
            answer++;
        }
        
        return answer;
    }
}