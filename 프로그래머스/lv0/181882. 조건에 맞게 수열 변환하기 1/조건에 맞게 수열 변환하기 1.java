import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        for(int i=0;i<answer.length;i++){
            if(answer[i]>=50&&answer[i]%2==0){
                answer[i]/=2;
            }
            else if(answer[i]<50&&answer[i]%2!=0){
                answer[i]*=2;
            }
        }
        return answer;
    }
}