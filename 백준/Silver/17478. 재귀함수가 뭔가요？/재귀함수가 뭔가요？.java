import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ss=n;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        String str1[]={"\"재귀함수가 뭔가요?\"","\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.","마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.","그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);        
        }
        
        chat(n,ss);
        for(int j=0;j<ss+1;j++){
            for(int i=ss;i>ss-n;i--){
                System.out.print("____");
           }n--;
            System.out.println("라고 답변하였지.");
        }
    }
   
    static void chat(int n,int ss){
        String str[]={"\"재귀함수가 뭔가요?\"","\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.","마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.","그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
        if(n==1){
            String sttr[]={"\"재귀함수가 뭔가요?\"","\"재귀함수는 자기 자신을 호출하는 함수라네\""};
            for(int i=0;i<sttr.length;i++){
                for(int j=0;j<ss;j++){
                    System.out.print("____");    
                }
                System.out.println(sttr[i]);
            }
        }
        else{
            for(int k=0;k<str.length;k++){
                for(int i=0;i<=ss-n;i++){
                    System.out.print("____");    
                }
                System.out.println(str[k]);
            }
            chat(n-1,ss);
        }
        
    }
        
        
        
            
    }
