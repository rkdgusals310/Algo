class Solution {
    public int solution(int[] array) {
        int temp[]=new int[array.length];
        
        int end=1;
        temp[0]=array[0];
        for(int i=1;i<array.length;i++){
            int index=end;
            for(int j=end-1;j>=0;j--){
                if(array[i]<temp[j]){
                    index=j;
                }
            }
            if(index!=end){
                for(int j=end;j>index;j--){
                temp[j]=temp[j-1];
                }
            }
            
            temp[index]=array[i];
            end++;
        }
        int answer = temp[temp.length/2];
        return answer;
    }
}