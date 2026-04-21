class Solution {
    public int solution(int a, int b, int c) {
        int answer=a+b+c;
        
        if(a==b&&a==c){
            answer=3*a*3*a*a*3*a*a*a;
        }
        else if(a==b||b==c||a==c){
            answer*=a*a+b*b+c*c;
        }
        return answer;
    }
}