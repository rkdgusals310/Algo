import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = Arrays.copyOf(emergency,emergency.length);
        int[] result = new int[emergency.length];
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length;j++){
                if(emergency[i]==answer[j]){
                    result[i]=emergency.length-j;
                }
            }
        }
        
        return result;
    }
}