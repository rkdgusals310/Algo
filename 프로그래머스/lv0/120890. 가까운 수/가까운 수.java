class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        int num = Integer.MAX_VALUE;
        int len=0;
        for(int i=0;i<array.length;i++){
            len=Math.abs(n-array[i]);
            if(answer>len){
                answer=len;
                num=array[i];
            }
            else if(answer==len){
                num=num>array[i]?array[i]:num;
            }
        }
        
        
        return num;
    }
}