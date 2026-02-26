import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            if(num!=0){
                stack.push(num);
            }
            else{
                if(!stack.isEmpty())stack.pop();
            }
        }
        int sum=0;
        int len=stack.size();
        for(int i=0;i<=len;i++){
            if(stack.isEmpty())break;
            sum+=stack.pop();
        }
        System.out.print(sum);
    }
}