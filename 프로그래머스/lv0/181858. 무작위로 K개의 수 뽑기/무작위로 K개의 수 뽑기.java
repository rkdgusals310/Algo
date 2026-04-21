import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(index==k)break;
            int cnt=0;
            for(int j=0;j<answer.length;j++){
                if(arr[i]==answer[j])cnt++;
            }
            if(cnt==0){
                answer[index]=arr[i];
                index++;
            }
        }
        
        return answer;
    }
}