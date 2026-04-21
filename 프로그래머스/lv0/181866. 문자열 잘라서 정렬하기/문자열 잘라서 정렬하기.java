import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        List<String> list=new ArrayList<>();
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        return list;
    }
}