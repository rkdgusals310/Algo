/*
    해당 문제의 핵심은 "중복 제거"라고 판단된다.
    my_string에서 중복된 문자를 제거
    - 중복 제거라는 단어를 보고 가장 먼저 떠오른 방식은 Set을 활용한 방법
    - 그렇지 않더라도 다른 Collections 클래스를 활용해야하긴해야할듯?
    
    - 위의 방법은 무조건 돌아갈것이라는 확신이 존재
    -> 다른 방법을 생각해본다.
    -> 배열을 활용한 풀이 방법? 
        - 알파벳 대문자와 소문자를 구분해야하므로 아스키코드를 활용
        - 65~122까지가 알파벳 대문자와 소문자 
        - 하지만 대문자 65~90 97~122 중간에 6개는 다른 값이 존재
        - 알파벳만하면 52이지만 52로 길이 설정하고 중간 값을 빼는 것을 계산하는 것보다
            58로 설정하고 그냥 저장하는 것이 효율적일것이라 판단. 97-65=32
        - 공백이 기존 32이지만 해당 값을 31에 저장하는 것으로 해결;
*/

class Solution {
    public String solution(String my_string) {
        StringBuilder answer =new StringBuilder();
        int alp[]=new int[58];
        int num=0;
        for(char str:my_string.toCharArray()){
            if(str==' ')alp[31]++;
            else{alp[str-65]++;}
        }
        for(char str:my_string.toCharArray()){
            if(str==' ')num=31;
            else{num=str-65;}
            
            if(alp[num]!=0){
                answer.append(str);
                alp[num]=0;
            }
        }
        return answer.toString();
    }
}