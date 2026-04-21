import java.util.*;
class Solution {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            int cnt=0;
            int end=1;
            for(int j=0;j+end<strArr[i].length();j++){
                if(strArr[i].substring(j,j+end+1).equals("ad")){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                answer.add(strArr[i]);
            }
        }
        return answer;
    }
}