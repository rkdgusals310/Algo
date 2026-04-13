import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Double> stack=new Stack<>();
        double arr[]=new double[26];
        int n=s.nextInt();
        String str=s.next();
        double total=0l;   
        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();
        }
        for(char c:str.toCharArray()){

            if((int)c>=65&&(int)c<91){
                stack.push(arr[(int)c-65]);
            }
            else{
                double b=stack.pop();
                double a=stack.pop();
                switch(c){
                    case '*': 
                        
                        stack.push(a*b);
                        break;
                    case '/':
                       
                        stack.push(a/b);
                        break;
                    case '+':
                       
                        stack.push(a+b);
                        break;
                    case '-':
                       
                        stack.push(a-b);
                        break;
                }
            }
        }
        System.out.printf("%.2f\n",stack.pop());
    }
}