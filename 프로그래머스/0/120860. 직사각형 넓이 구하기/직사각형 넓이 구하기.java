import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots,(a,b)->{
            if(a[0]==b[0])return b[0]-a[0];
            return a[0]-b[0];
        });
        int answer = (dots[1][1]-dots[0][1])*(dots[2][0]-dots[1][0]);
        return answer;
    }
}