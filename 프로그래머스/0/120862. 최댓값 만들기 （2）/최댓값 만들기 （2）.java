import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int temp=numbers[0]*numbers[1];
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        answer=answer>temp?answer:temp;
        return answer;
    }
}