class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int num=2;

        while(true){
            if(num>a){
                break;
            }
            if(a%num==0&&b%num==0){
                a/=num;
                b/=num;
            }
            else{
                num++;
            }
        }

        while(true){
            if(b==1)break;
            if(b%2==0)b/=2;
            else if(b%5==0)b/=5;
            else{
                answer = 2;
                break;
            }
        }
        
        
        return answer;
    }
}