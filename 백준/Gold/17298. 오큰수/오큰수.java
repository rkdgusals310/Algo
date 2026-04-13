import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        
        int arr[]=new int[n];
        int bigNum[]=new int[n];
        Arrays.fill(bigNum,-1);
        
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        for(int i=0;i<n;i++){
            int num=arr[i];
            while(true){
                if(!stack.isEmpty()&&arr[stack.peek()]<num){
                    bigNum[stack.pop()]=num;

                }
                else{
                    break;
                }
            }stack.push(i);
        }
        for(int i=0;i<n;i++){
            sb.append(bigNum[i]).append(" ");
        }System.out.print(sb);
        
    }    
}