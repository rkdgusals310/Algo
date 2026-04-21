class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String str[][]=new String[my_string.length()/m][m];
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[0].length;j++){
                str[i][j]=""+my_string.charAt(m*i+j);
            }
        }
        for(int i=0;i<str.length;i++){
            answer+=str[i][c-1];
        }
        return answer;
    }
}