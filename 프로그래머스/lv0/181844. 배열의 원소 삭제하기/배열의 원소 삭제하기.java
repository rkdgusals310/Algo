import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i:delete_list){
            list.add(i);
        }
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}