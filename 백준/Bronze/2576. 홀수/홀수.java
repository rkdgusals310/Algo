/*
    7개의 자연수가 주어질때 이중에서 홀수들을 구해
    홀수들의 합과 가장 작은 홀수 값을 구하여 출력
    minOdd
    sumOdd
    이렇게 변수 선언하고 입력받아 2로 나누어서 나머지가 0이 아니면 홀수로 판단
    일부 수학적인 경우를 제외하면 자연수에 0은 포함되지 않으므로 
    1~99사이의 자연수들을 입력받는 것으로 결정
*/
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int minOdd=100;
        int sumOdd=0;
        String str="-1";
        for(int i=0;i<7;i++){
            int num=s.nextInt();
            
            if(num%2!=0){
                sumOdd+=num;
                minOdd=minOdd>num?num:minOdd;
            }
        }
        if(minOdd!=100){
            str=""+sumOdd+"\n"+minOdd;
        }
        System.out.print(str);
    }
}