class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            while(true){
                if(array[i]%10==7)answer++;
                if(array[i]/10<=1)break;
                array[i]/=10;
            }
           
        }
        
        
        
        return answer;
    }
}