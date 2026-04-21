class Solution {
    public int solution(String my_string) {
        String str[]=my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        int i=1;
        
        while(i<str.length){
            switch(str[i]){
                case "+":
                    answer+=Integer.parseInt(str[i+1]);
                    break;
                case "-":
                    answer-=Integer.parseInt(str[i+1]);
                    break;
            }
            i+=2;
        }
        return answer;
    }
}
//  3 + 5 + 5   1 3