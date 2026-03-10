import java.util.*;


/*
    문제를 읽고 바로 생각나는 방법은 단순비교
    최대 입력값이 크기 때문에 반복문 한번만 사용해야함

*/
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        if(n<1||n>100)return;
        int cnt=0;
        String str="IOI";
        for(int i=1;i<n;i++){
            str+="OI";
        }
        
        int m=sc.nextInt();
        if(m<(2*n+1)||n>10000)return;
        String s=sc.next();

        for(int i=0;i<=m-str.length();i++){
            if(s.substring(i,i+str.length()).equals(str))cnt++;
        }
        
        System.out.print(cnt);
    }
}