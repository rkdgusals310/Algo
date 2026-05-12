/*
    홍박사님의 연구실에 도착
    N마리중 N/2 마리 가져가도 좋다고함.
    
    가장 많은 종류를 선택하고 싶은데
    그러려면 중복이 없어야함
    
    원하는 출력값은 포켓몬 종류 번호의 개수
    
    
*/
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt=0;
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                cnt++;
            }
        }
        answer=nums.length/2;
        cnt=nums.length-cnt;
        if(answer>cnt)answer=cnt;
        
        return answer;
    }
}