import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(s.nextInt());
        }
        int n2=s.nextInt();
        for(int i=0;i<n2;i++){
            int num=s.nextInt();
            int len=set.size();
            set.add(num);
            if(len!=set.size()){sb.append(0).append(" ");}
            else{sb.append(1).append(" ");}
            set.remove(num);
        }
        System.out.print(sb);
    }
}