class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[str_list.length];
        int len=0;
        int cnt=0;
        for(String str:str_list){
            if(cnt==0&&str.equals("r")){
                answer=new String[str_list.length-len];
                len=0;
                cnt++;
                continue;
            }
            else if(cnt==0&&str.equals("l")){cnt++;break;}
            answer[len]=str;
            len++;
        }
        if(cnt==0)len=0;
        String temp[]=new String[len];
        
        for(int i=0;i<len;i++){
            temp[i]=answer[i];
        }
        return temp;
    }
}