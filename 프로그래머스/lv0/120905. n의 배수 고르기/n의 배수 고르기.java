//numlist에 있는 값들을 n과 직접 비교하는 방법
import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer.add(numlist[i]);
            }
        }
        int listN[]=new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            listN[i]=answer.get(i);
        }
        return listN;
    }
    
}