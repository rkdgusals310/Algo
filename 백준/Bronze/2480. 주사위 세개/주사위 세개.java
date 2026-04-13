/*
    주사위 세개가 주어지고 아래의 규칙에 따라 상금을 받는다
    
    - 세개가 모두 같은 숫자 10000+(같은 눈)*1000
    - 두개가 같은 숫자 1000+(같은 눈)*100
    - 모두 다른 눈 (가장 큰 눈)*100
    
    maxN: 3개의 주사위 중 가장 큰 수를 저장
    sameN: 같은 수를 저장하는 
*/
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        int maxN=a;
        int sameN=a;
        int winning=0;
        if(b==c){
            sameN=b;
        }
        maxN=maxN>b?maxN>c?maxN:c:b>c?b:c;
        // 삼항 연산자가 익숙하지 않다면  Math.max(a, Math.max(b, c));
        //이런 식으로 함수를 활용하거나 if문을 활용해도 가능하다.
        if(a==b&&a==c){
            winning=10000+sameN*1000;
        }
        else if(a==b||a==c||b==c){
            winning=1000+sameN*100;
        }
        else{
            winning=maxN*100;
        }
        System.out.print(winning);
    }
}