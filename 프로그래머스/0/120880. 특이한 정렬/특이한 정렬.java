import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer=new int[numlist.length];
        Integer[] temp=new Integer[numlist.length];
        
        for(int i=0;i<answer.length;i++){
            temp[i]=numlist[i];
        }
        
        Arrays.sort(temp,(a,b)->{
           if(Math.abs(n-a)==Math.abs(n-b)){
               return Integer.compare(b,a);
           } 
           else{
               return Integer.compare(Math.abs(n-a),Math.abs(n-b));
           }
        });
        
        for(int i=0;i<answer.length;i++){
            answer[i]=temp[i];
        }
        
        return answer;
    }
}