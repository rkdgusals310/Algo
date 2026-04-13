import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(s.nextInt());
        }
        list.sort(Comparator.naturalOrder());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}