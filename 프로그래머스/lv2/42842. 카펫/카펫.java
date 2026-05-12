class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
  
        int a=0;
        int b=0;

        
        for(int i=1;i<=yellow/i;i++){
            a=yellow/i;
            b=i;

            if(brown==((a+2)*2+b*2)){
                answer[0]=a+2;
                answer[1]=b+2;
            }
            
        }

        return answer;
    }
}
