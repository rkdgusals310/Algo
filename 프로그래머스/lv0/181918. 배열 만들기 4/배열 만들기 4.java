import java.util.Stack;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk=new Stack<>();
        
        int len=arr.length;
        int i=0;
        while(i!=len){
            if(stk.isEmpty()){
                stk.push(arr[i]);
                i++;
            }
            else if(stk.peek()<arr[i]){
                stk.push(arr[i]);
                i++;
            }
            else{
                stk.pop();
            }
        }
        
        
        
        return stk;
    }
}

//stack을 사용한 풀이도 가능할듯?