/*
    괄호 ( )로만 구성되어 있는 문자열 
    올바른 괄호  문자열  VPS라고 함
    한쌍의 괄호 기호로 된 () 문자열은 기본 VPS
    
*/
//(())())
import java.util.*;

public class Main{
    public static void main(String args[]){
        Stack<Character> stack=new Stack<>();
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String answer="YES";
        
        int n=s.nextInt();
        boolean breakN=false;
        for(int i=0;i<n;i++){
            breakN=false;
            String str=s.next();
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(stack.isEmpty()){
                    if(c=='(')stack.push(c);
                    else{
                        breakN=true;
                        break;
                    }
                }
                else{
                    if(stack.peek()=='('&&c==')')stack.pop();
                    else if(stack.peek()=='('&&c=='(')stack.push(c);
                    
                }
            }
            if(breakN||!stack.isEmpty())answer="NO";
            else answer="YES";
            stack.clear();
            sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}