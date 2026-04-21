class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String temp[]=my_string.split("");
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            int len=b-a+1;
            
            for(int j=0;j<len/2;j++){
                String t=temp[a+j];
                temp[a+j]=temp[b-j];
                temp[b-j]=t;
            }
        }
        
        for(String str:temp){
            answer+=str;
        }
        return answer;
    }
}