import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int index=0;
        int num[]=Arrays.copyOf(array,array.length);
        Arrays.sort(array);
        
        for(int i=0;i<num.length;i++){
            if(array[array.length-1]==num[i])index=i;
        }
        
        int[] answer = {array[array.length-1],index};
        
        return answer;
    }
}