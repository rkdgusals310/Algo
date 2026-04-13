import java.util.*;

public class Main{
    static int start=0;
    static int end=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        start=end=n;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            String str=s.next();
            switch(str){
                case "push_front":
                    offerFirst(s.nextInt(),arr);
                    break;
                case "push_back":
                    offerLast(s.nextInt(),arr);
                    break;
                case "pop_front":
                    int popNumF=-1;
                    if(isEmpty()==0){
                        popNumF=pollFirst(arr);
                    }
                    sb.append(popNumF).append("\n");
                    break;
                case "pop_back":
                    int popNumB=-1;
                    if(isEmpty()==0){
                        popNumB=pollLast(arr);
                    }
                    sb.append(popNumB).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    int emptyNum=1;
                    if(isEmpty()==0){
                        emptyNum=0;
                    }
                    sb.append(emptyNum).append("\n");
                    break;
                case "front":
                    int numF=-1;
                    if(isEmpty()==0){
                        numF=peekFirst(arr);
                    }
                    sb.append(numF).append("\n");
                    break;
                case "back":
                    int numB=-1;
                    if(isEmpty()==0){
                        numB=peekLast(arr);
                    }
                    sb.append(numB).append("\n");
                    break;
            }
        }System.out.print(sb);
    }
    static void offerFirst(int n,int arr[]){
        arr[--start]=n;
    }
    static void offerLast(int n,int arr[]){
        arr[end++]=n;
    }
    
    static int pollFirst(int arr[]){
        return arr[start++];
    }
    
    static int pollLast(int arr[]){
        return arr[--end]; 
    }
    
    static int size(){
        return end-start;
    }
    
    static int isEmpty(){
        int num=1;
        if(end!=start){num=0;}
        return num;
    }
    static int peekFirst(int arr[]){
        return arr[start];
    }
    static int peekLast(int arr[]){
        return arr[end-1]; 
    }
}