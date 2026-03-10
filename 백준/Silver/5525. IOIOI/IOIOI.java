import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        int cnt=0;
        int start=0;
        int index=0;
        int t=0;
        while(true){
            char ch=s.charAt(index);
            if(start==0&&ch=='I'){
                start=1;
                index++;
            }
            else if(start==0&&ch=='O'){
                index++;
                continue;
            }
            else{
                if(start%2==0&&ch=='I'){index++;start++;}
                else if(start%2==1&&ch=='O'){index++;start++;}
                else{
                    t=(start-1)/2;
                    if(t>=n){
                        cnt+=t-n+1;
                    }
                    
                    start=0;
                }
            }
            
            if(index==s.length()){
                    t=(start-1)/2;
                    if(t>=n){
                        cnt+=t-n+1;
                }
                break;
            }
        }
        
        System.out.print(cnt);
    }
}