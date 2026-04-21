class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        int angleN=angle%90;
        
        if(angleN==0){
            answer=angle/90*2;
        }
        else{
            answer=angle/90*2+1;
        }
        
        
        return answer;
    }
}