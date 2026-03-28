/*
    5개의 숫자가 주어지고 그 수들의 평균과 중양값을 구하는 문제
    5개의 숫자를 배열에 입력 받고 입력 받으면서 
    sum구하고 
    중앙값은 배열 정렬해서 arr[2]를 출력하는 식으로 문제 해결 가능할 것으로 보임
    숫자는 100보다 작은 10의 배수이므로 시간복잡도는 크게 문제가 되지 않을 것
    
*/
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        
        System.out.print(sum/5+"\n"+arr[2]);
    }
}