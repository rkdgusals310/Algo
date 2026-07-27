class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str="";
        for(char c:my_string.toCharArray()){
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                if(str.equals(""))continue;
                answer+=Integer.parseInt(str);
                str="";
            }
            else{
                str+=c;
            }
        }
        if(!str.equals(""))answer+=Integer.parseInt(str);
        return answer;
    }
}