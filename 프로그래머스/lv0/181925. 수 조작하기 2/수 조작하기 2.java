class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer =new StringBuilder();
        
        String temp="";
        for(int i=1;i<numLog.length;i++){
            
            switch(numLog[i]-numLog[i-1]){
                    case 1:
                        temp="w";
                        break;
                    case -1:
                        temp="s";
                        break;
                    case 10:
                        temp="d";
                        break;
                    case -10:
                        temp="a";
                        break;
            }
            answer.append(temp);
        }
        return answer.toString();
    }
}