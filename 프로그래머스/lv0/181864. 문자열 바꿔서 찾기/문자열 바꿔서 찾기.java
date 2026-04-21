class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str="";
        for(char c:myString.toCharArray()){
            c=c=='A'?'B':'A';
            str+=""+c;
        }
        int end=pat.length()-1;
        for(int i=0;i+end<myString.length();i++){
            if(str.substring(i,end+1+i).equals(pat)){
                answer=1;
                break;
            }
        }
        return answer;
    }
}