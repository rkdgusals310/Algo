import java.util.*;

public class Main{
    public static void main(String args[]){
       
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        int m=s.nextInt();
        int start=-1;
        int end=n;
        int cnt=n;
        int count=0;
        //원형큐? 수학적인 접근 데큐?
        
        int []queue=new int[n];
        int []result=new int[n];
        for(int i=1;i<n+1;i++){
            queue[i-1]=i;
        }
        while(cnt!=0){
            start=(start+1)%n;
            if(start>-1&&queue[start]==-1){continue;}
            count++;
            if(count==m){
                count=0;
                result[n-cnt]=queue[start];
                queue[start]=-1;
                cnt--;
             }
        }

        sb.append("<");
        int len=n;
        for(int i=0;i<len;i++){
            if(i==0){sb.append(result[i]);}
            else{sb.append(", ").append(result[i]);}
        }sb.append(">");
        System.out.print(sb);
    }
}