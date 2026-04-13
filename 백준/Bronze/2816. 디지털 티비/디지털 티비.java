import java.util.*;

public class Main{
    public static List<String> list=new ArrayList<>();
    public static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int breakN=0;
        
        String kbs[]={"KBS1","KBS2"};
        
        for(int i=0;i<n;i++){
            list.add(s.next());
        }
        int i=0;//현재 화살표
        while(breakN!=2){
            if(list.get(i).equals(kbs[breakN])){
                //kbs 찾았고 breakN으로 이동해야함
                move(breakN,i);
                i=breakN;
                breakN++;
            }
            else{
                i++;
                sb.append(1);
            }
        }
        System.out.print(sb);
        
    }
    public static void move(int breakN,int i){
        for(int k=i;k>breakN;k--){
            String temp=list.get(k);
            list.remove(k);
            list.add(k-1,temp);
            sb.append(4);
            
        }
    }
}
/*
    m
*/