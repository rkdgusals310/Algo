class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num[]=new int[2];
        
        for(char c:polynomial.toCharArray()){
            if(c==' ')continue;
            if(c=='+'){
                xDis(num,answer);
                answer="";
            }
            else{
                answer+=""+c;
            }
        }
        
        xDis(num,answer);
        answer="";
        
        boolean cnt=false;
        for(int i=0;i<2;i++){
            if(num[i]==0)continue;
            if(i==0){
                if(num[i]==1)answer+="x";
                else answer+=num[i]+"x";
                
                cnt=true;
            }
            else{
                if(cnt)answer+=" + ";
                answer+=num[i];
            }
        }
        
        return answer;
    }
    public void xDis(int []num,String answer){
        int n=1;
        if(answer.equals("x"))answer="1x";
        if(answer.charAt(answer.length()-1)=='x'){
            answer=answer.substring(0,answer.length()-1);
            n=0;
        }
        num[n]+=Integer.parseInt(answer);
    }
}