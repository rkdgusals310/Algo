/*
    숫자와 "Z"가 공백으로 담긴 문자열 s
    - s 문자열의 숫자합을 구하려함
    - "Z"가 나오기전에 숫자는 합에 포함하지 않음
    - s길이 1~200
    
    숫자와 Z만이 담긴 문자열이라고 하였으니 
    split를 통해 문자열을 공백기준으로 나누어주고
    "Z"가 아닐 경우 이전 배열값을 빼주는 형식으로 작성
    "Z"는 s의 시작 값이 될 수 없으므로 특별한 고려사항은 존재하지 않는다.

*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str[]=s.trim().split("\\s+");
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("Z"))answer+=Integer.parseInt(str[i]);
            else {
                if(!str[i-1].equals("Z"))answer-=Integer.parseInt(str[i-1]);
            }
        }
        
        return answer;
    }
}