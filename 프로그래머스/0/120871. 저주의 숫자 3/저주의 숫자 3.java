class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            answer++;
            int temp=answer;
            while(true){
                if(answer%3==0)answer++;
                else{
                    String num=""+answer;
                    if(num.contains("3"))answer++;  
                }
                if(temp==answer)break;
                temp=answer;
            }

        }
        
        return answer;
    }
}