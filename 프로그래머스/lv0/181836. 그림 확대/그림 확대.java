class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int index=0;
        for(String str:picture){
            String st="";
            for(int i=0;i<str.length();i++){
                for(int j=0;j<k;j++){
                    st+=""+str.charAt(i);
                }
            }
            for(int i=0;i<k;i++){
                answer[index]=st;
                index++;
            }
            
        }
        return answer;
    }
}