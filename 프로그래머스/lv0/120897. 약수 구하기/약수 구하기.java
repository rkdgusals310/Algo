class Solution {
    public int[] solution(int n) {
        
        int cnt=0;
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)cnt++;
        }
        int[] answer = new int[cnt];
        
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                answer[index]=i;
                index++;
            }
        }
        return answer;
    }
}