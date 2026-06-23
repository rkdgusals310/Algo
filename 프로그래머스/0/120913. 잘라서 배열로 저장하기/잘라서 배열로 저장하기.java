class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n+(my_str.length()%n==0?0:1)];
        
        
        for(int i=0;i<answer.length;i++){
            if((i*n+n)<=my_str.length()-1)
            answer[i]=my_str.substring(i*n,i*n+n);
            
            else{
                answer[i]=my_str.substring(i*n);
            }
        }
        return answer;
    }
}