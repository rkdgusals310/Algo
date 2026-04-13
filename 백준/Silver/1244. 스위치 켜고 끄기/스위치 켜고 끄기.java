/*
1~N까지 연속적으로 번호가 붙어있는 스위치가 존재(ON(1) or OFF(0))
학생 몇명 선정 -> 학생들에게 1~N 사이의 번호를 하나씩 나누어준다. //완

<조건> 남학생 1 / 여학생 2 -> 함수형태로 구현 예정 ~ing
남 스위치 번호가 자기 받은 번호의 배수 -> 스위치 상태 변환
여 자기 받은 번호와 같은 스위치 중심 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간을 찾아 
    -> 해당 구간 스위치 상태 모두 바꾼다.


<입력>  
스위치 개수 N 100이하 양수      //완
스위치의 상태                  //완
학생 수      100이하 양수      //완
학생 성별 학생이 받은 번호      //완

순수 구현문제 같다는 생가으로 접근

*/


import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt(); // 스위치 개수
        int switchStatus[]=new int[n+1]; // 스위치 상태 배열 _ ON(1)/OFF(0)
        
        for(int i=1;i<=n;i++){
            switchStatus[i]=s.nextInt();
        }
        
        int students=s.nextInt();// 학생 수
        int gender=0; // 학생 성별 _ 남(1)/여(2
        int num=0; // 받은 번호 
        for(int i=0;i<students;i++){
            gender=s.nextInt();
            num=s.nextInt();
            if(gender==1){male(num,switchStatus);}
            else{female(num,switchStatus);}
        }
        
        for(int i=1;i<=n;i++){
            sb.append(switchStatus[i]).append(" ");
            if(i%20==0){
                sb.append("\n");
            }
            
        }
        System.out.println(sb);
    }
    public static void male(int num,int switchStatus[]){
        for(int i=num;i<switchStatus.length;i+=num){
            swichNum(i,switchStatus);
        }
    }
    public static void female(int num,int switchStatus[]){
        int left=0;
        int right=0;
        int cnt=1;
        swichNum(num,switchStatus);
        while(true){
            left=num-cnt;
            right=num+cnt;
            if(right<switchStatus.length&&left>0&&switchStatus[left]==switchStatus[right]){
                swichNum(left,switchStatus);
                swichNum(right,switchStatus);
                cnt++;
            }
            else{break;}
        }
    }
    public static void swichNum(int index,int switchStatus[]){
        if(switchStatus[index]==0){switchStatus[index]=1;}
        else{switchStatus[index]=0;}
    }
}