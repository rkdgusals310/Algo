import java.util.*;
import java.io.*;

public class Main{
    static int start=-1;
    static int end=0;
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb=new StringBuilder();
        int num=Integer.parseInt(br.readLine());
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            String str[]=br.readLine().split(" ");
            switch(str[0]){
                case "push":
                    push(Integer.parseInt(str[1]),arr);
                    break;
                case "pop":
                    sb.append(pop(arr)).append("\n");
                    break;
                case "size":
                    sb.append(size(arr)).append("\n");
                    break;
                case "empty":
                    sb.append(empty(arr)).append("\n");
                    break;
                case "front":
                    sb.append(front(arr)).append("\n");
                    break;
                case "back":
                    sb.append(back(arr)).append("\n");
                    break;
            }
        }System.out.print(sb);
        
    }
    static void push(int n,int arr[]){
        start+=1;
        arr[start]=n;

        
    }
    static int pop(int arr[]){
        int popNum=-1;
        if(start!=(end-1)){
            popNum=arr[end];
            end+=1;
           
        }
        
        return popNum;
    }
    static int size(int arr[]){
        return start+1-end;
    }
    static int empty(int arr[]){
        int emptyCheck=1;
        if(start!=(end-1)){emptyCheck=0;}
        return emptyCheck;
    }
    static int front(int arr[]){
        int frontNum=-1;
        if(start!=(end-1)){frontNum=arr[end];}
        return frontNum;
    }
    static int back(int arr[]){
        int backNum=-1;
        if(start!=(end-1)){backNum=arr[start];}
        return backNum;
    }
}