class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        int[] temp={};
        for(int i=0;i<query.length;i++){
            if(i%2==0){
                temp=new int[query[i]+1];
                for(int j=0;j<query[i]+1;j++){
                    temp[j]=answer[j];
                }
            }
            else{
                int index=0;
                temp=new int[answer.length-query[i]];
                for(int j=query[i];j<answer.length;j++){
                    temp[index]=answer[j];
                    index++;
                } 
            }
            answer=temp;
        }
        return temp;
    }
}