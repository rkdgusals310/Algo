/*
문제 분석
    키로거를 설치해 컴퓨터 비밀번호를 알아내려고 할때 아래와 같은 조건을 가지고 비밀번호를 알아내야한다.
    조건 
    - < > 왼쪽/오른쪽으로 커서의 위치를 이동시킬 수 있다.
    - -는 글자 지움 바로 앞이 글자라면 지운다.
    
    단순 구현이라고 판단하였고 
    List를 활용하여 좌표위치에 추가하는 방식으로 코드를 구현해보기로 결정하였다.
    
    입력
    테스트 케이스 test
    테스트 케이스마다 입력받은 값을 저장하는 List
    


*/

import java.util.*;

public class Main{
    public static List<Character> list=new LinkedList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int test=s.nextInt();
        for(int t=0;t<test;t++){
            ListIterator<Character> it=list.listIterator();
            String str=s.next();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='<'){
                    if(it.hasPrevious()){
                         it.previous();
                    }
                   
                }
                else if(str.charAt(i)=='>'){
                    if(it.hasNext()){
                        it.next();
                    }
                }
                else if(str.charAt(i)=='-'){
                    if(it.hasPrevious()){
                        char ch=it.previous();
                        if(ch!='>'&&ch!='<'){
                            it.remove();
                        }else{it.next();}
                        
                    }
                }
                else{
                    it.add(str.charAt(i));
                }
            }
            while(it.hasPrevious()) it.previous();
            while(it.hasNext()){
                sb.append(it.next());
            }sb.append("\n");
            list.clear();
        }
        System.out.print(sb);
    }

}