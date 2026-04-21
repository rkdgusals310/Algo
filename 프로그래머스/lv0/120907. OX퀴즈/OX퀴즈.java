import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        Arrays.fill(answer,"X");
        for(int i=0;i<answer.length;i++){
            int num=0;
            String[] tmp =quiz[i].split(" ");
            if(tmp[1].charAt(0)=='-'){
                num=Integer.parseInt(tmp[0])-Integer.parseInt(tmp[2]); 
            }
            else{
               num=Integer.parseInt(tmp[0])+Integer.parseInt(tmp[2]); 
            }
            
            if(num==Integer.parseInt(tmp[4]))answer[i]="O";
        }
        return answer;
    }
}