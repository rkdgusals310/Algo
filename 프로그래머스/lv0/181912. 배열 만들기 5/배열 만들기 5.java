import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<intStrs.length;i++){
            String str="";
            for(int j=0;j<l;j++){
                str+=intStrs[i].charAt(s+j);
            }
            
            if(Integer.parseInt(str)>k)answer.add(Integer.parseInt(str));
        }
        return answer;
    }
}