class Solution {
    public int[] solution(int[] arr) {
        
        int len=arr.length;
        int index=0;
        while(true){
            if(Math.pow(2,index)>=len)break;
            index++;
        }
        int[] answer = new int[(int)Math.pow(2,index)];
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}