import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        int n=s.nextInt();
        
        for(int i=0;i<n;i++)stack2.push(s.nextInt());
        for(int i=0;i<n;i++)stack1.push(stack2.pop());
        
        Stack<Integer> stack=new Stack<>();
        int start=1;
        String str="Sad";
        while(true){
            if(stack.isEmpty()){
              
                 if(start!=stack1.peek()){
                    stack.push(stack1.pop());
                }
                else{
                    start++;
                }
            }
            else{
                if(!stack1.isEmpty()){
                    if(stack.peek()==start){stack.pop();start++;}
                    else if(stack1.peek()!=start){stack.push(stack1.pop());}
                    else{stack1.pop();start++;}
                }
                else{
                    if(stack.peek()!=start){break;}
                    else{stack.pop();start++;}
                    
                }
            }
            if(start==n){str="Nice";break;}
             
        }
        System.out.println(str);
    }
}