class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        for(int i=0;i<code.length();i++){
            char ch=code.charAt(i);
            if(mode==0){
                if(ch!='1'&&i%2==0){
                    answer+=ch;
                }
                else if(ch=='1')mode=1;
            }
            else{
               if(ch!='1'&&i%2!=0){
                    answer+=ch;
                }
                else if(ch=='1')mode=0; 
            }
        }
        return answer=answer==""?"EMPTY":answer;
    }
}