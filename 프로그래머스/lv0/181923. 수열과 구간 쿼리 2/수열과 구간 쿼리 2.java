import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,-1);
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int c=queries[i][2];
            
            for(int j=a;j<b+1;j++){
                if(arr[j]>c){
                    answer[i]=answer[i]==-1?arr[j]:Math.min(answer[i],arr[j]);
                }
            }
            if(answer[i]==Integer.MAX_VALUE)answer[i]=-1;
        }
        
        
        return answer;
    }
}