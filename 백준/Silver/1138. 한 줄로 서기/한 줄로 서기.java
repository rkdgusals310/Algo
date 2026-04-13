import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        List<Integer> list=new ArrayList<>();
        List<int[]> list2=new ArrayList<>();
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            int highCm=s.nextInt();
            list2.add(new int[]{highCm,i+1});
        }
        Collections.sort(list2,(a,b)->b[1]-a[1]);
        
        for(int i=0;i<n;i++){
            list.add(list2.get(i)[0],list2.get(i)[1]);
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}