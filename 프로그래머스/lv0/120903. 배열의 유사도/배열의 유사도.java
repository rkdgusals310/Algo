/*
    같은 원소의 개수를 구해야한다고 했을때
    바로 떠오르는 방법은 2가지 정도이다.
    Set을 활용해 중복 카운트하는 방법과
    contains를 활용해 문제를 해결하는 방식이다.

*/
import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        
        for(int i=0;i<s1.length;i++){
            if(Arrays.asList(s2).contains(s1[i]))answer++;
        }
        return answer;
    }
}