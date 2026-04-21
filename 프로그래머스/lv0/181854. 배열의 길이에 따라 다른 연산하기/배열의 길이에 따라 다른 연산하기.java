class Solution {
    public int[] solution(int[] arr, int n) {
        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];
        int[] answer={};
        boolean evenOdd=arr.length%2==0?true:false;
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                
                even[i]=arr[i];
                odd[i]=arr[i]+n;
            }
            else{
                even[i]=arr[i]+n;
                odd[i]=arr[i];
            }
        }
        if(evenOdd){
            answer=even;
        }
        else{
            answer=odd;
        }
        
        return answer;
    }
}