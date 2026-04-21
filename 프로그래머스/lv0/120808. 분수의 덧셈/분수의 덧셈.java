class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer ={numer1*denom2+denom1*numer2,denom1*denom2};
        int x=0;
        int y=0;
        int i=2;
        int len=answer[0]<answer[1]?answer[0]:answer[1];
        while(true){
            if(i>len)break;
            if(answer[0]%i==0&&answer[1]%i==0){
                answer[0]/=i;
                answer[1]/=i;
            }
            else{
                i++;
            }
            
        }
        return answer;
    }
}