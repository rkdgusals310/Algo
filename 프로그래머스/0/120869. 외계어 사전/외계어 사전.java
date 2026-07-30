class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String str:dic){
            int cnt=spell.length;
            for(String s:spell){
                if(str.contains(s))cnt--;
            }
            if(cnt==0){
                System.out.println(str);
                answer=1;
                break;
            }
        }
        
        return answer;
    }
}