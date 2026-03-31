/*
    윷놀이
    배 0, 등 1
    - 도 0 1 1 1 A
    - 개 0 0 1 1 B  
    - 걸 0 0 0 1 C
    - 윷 0 0 0 0 D
    - 모 1 1 1 1 E
    입력 받고 배, 등 카운트해서 위 조건에 맞게 A,B,C,D,E 
*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int zero=0;
        char ch='A';
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                int n=s.nextInt();
                if(n==0)zero++;
            }
            switch(zero){
                case 1:
                    ch='A';
                    break;
                case 2:
                    ch='B';
                    break;
                case 3:
                    ch='C';
                    break;
                case 4:
                    ch='D';
                    break;
                case 0:
                    ch='E';
                    break;
            }
            zero=0;
            sb.append(ch).append("\n");
        }
        System.out.print(sb);
    }
}
//여기서 보완할점이 존재
// 굳이 등과 배 둘다 카운트하고 if문으로 접근할 필요없이 
// 배 or 등 둘중 하나 카운트하고 switch문으로 접근하는게 더 좋아보임  