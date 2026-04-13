import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(s.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<3;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}