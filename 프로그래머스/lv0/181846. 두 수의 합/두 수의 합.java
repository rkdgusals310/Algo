class Solution {
    public String solution(String a, String b) {
        String answer = "";
        int startA=a.length();
        int startB=b.length();
        int sum=0;
        int aN=0;
        int bN=0;
        int carry=0;
        while(true){
            if(startA==0&&startB==0){
                break;
            }
            
            if(startA!=0){
                startA--;
                aN=a.charAt(startA)-'0';
            }
            else{
               aN=0; 
            }
            
            if(startB!=0){
                startB--;
                bN=b.charAt(startB)-'0';
            }
            else{
                bN=0;
            }
            
            sum=bN+aN+carry;
            carry=sum/10;
            sum=sum%10;
            answer+=sum;
            
        }
        if(carry>0)answer+=carry;
        StringBuffer sb = new StringBuffer(answer);        
        String reverse = sb.reverse().toString();
            
        return reverse;
    }
}