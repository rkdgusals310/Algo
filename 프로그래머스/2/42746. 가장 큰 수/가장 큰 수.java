import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Integer[] arr = new Integer[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            arr[i]=numbers[i];
        }
        
        Arrays.sort(arr,(o1,o2)->{
            String s1=String.valueOf(o1)+String.valueOf(o2);
            String s2=String.valueOf(o2)+String.valueOf(o1);

            return Integer.compare(Integer.parseInt(s1),Integer.parseInt(s2));

        });
        if(arr[numbers.length-1]==0) return "0";
        for(int i=numbers.length-1;i>=0;i--)answer+=arr[i];
        return answer;
    }
}