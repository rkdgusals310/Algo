import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int yearCheck=0;
        if(n%4==0&&(n%100!=0||n%400==0))yearCheck=1;
        System.out.print(yearCheck);
    }
}

/*
    연도가 주어졌을때 윤년을 구하는 프로그램을 작성하는 문제
    - 운년은 4의 배수 and (!100의 배수 || 400의 배수)
*/