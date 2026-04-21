import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int temp[]=Arrays.copyOf(arr,arr.length);
        int answer = 0;
        int cnt=0;
        while(true){
            cnt=0;
            for(int i=0;i<temp.length;i++){
                if(temp[i]>=50&&temp[i]%2==0){
                    temp[i]/=2;
                }
                else if(temp[i]<50&&temp[i]%2!=0){
                    temp[i]=temp[i]*2+1;
                }
                else{
                    cnt++;
                }
            }
            answer++;
            if(cnt==arr.length)break;
        }
        
        return answer-1;
    }
}