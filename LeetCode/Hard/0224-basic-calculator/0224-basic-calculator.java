class Solution {
    public int calculate(String s) {
        Queue<String> q=new LinkedList<>();
        Stack<String> stack=new Stack<>();
        Stack<String> temp=new Stack<>();

        String n="";
        int cnt=0;
        for(String str:s.split("")){
            if(str.equals(" "))continue;

            if(!str.equals("(")&&!str.equals(")")&&!str.equals("-")&&!str.equals("+")){
                n+=str;
                cnt++;
            }
            else{
                if(cnt!=0){
                    q.offer(n);
                    cnt=0;
                    n="";
                }
                q.offer(str);
            }
        }
        if(cnt!=0)q.offer(n);
        while(!q.isEmpty()){
            String basic=q.poll();
            if(basic.equals(")")){
                while(true){
                    String t=stack.pop();
                    if(t.equals("(")){
                        stack.push(cal(temp));
                        break;
                    }
                    temp.push(t);
                }
                
            }
            else {
                stack.push(basic);
            }
        }
        while(!stack.isEmpty())temp.push(stack.pop());
        return Integer.parseInt(cal(temp));

    }
    public String cal(Stack<String> stack){
        int num=0;
        String op="*";

        while(!stack.isEmpty()){
            String ch=stack.pop();
            
            if(ch.equals("+")){
                op="+";
            }
            else if(ch.equals("-")){
                op="-";
            }
            else{
                if(op.equals("*")){
                    num=Long.parseLong(ch);
                }
                else{
                    if(op.equals("+"))num+=Long.parseLong(ch);
                    else num-=Long.parseLong(ch);
                    op="*";
                }
            }
        }

        return ""+num;
    }
}