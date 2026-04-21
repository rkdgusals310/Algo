class Solution {
    public int[] solution(int[] arr) {
        
        int start=0;
        int end=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0&&arr[i]==2){
                start=i;
                end=i;
                cnt++;
            }
            else if(cnt!=0&&arr[i]==2){
                end=i;
            }
        }
        int[] answer = new int[end-start+1];
        int index=0;
        answer[0]=-1;
        
        if(cnt==0)return answer;
        
        for(int i=start;i<end+1;i++){
            answer[index]=arr[i];
            index++;
        }
        return answer;
    }
}