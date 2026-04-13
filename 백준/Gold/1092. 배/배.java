import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int day=0;
        
        int n=s.nextInt();
        Integer crane[]=new Integer[n];
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            crane[i]=s.nextInt();
        }
        
        int m=s.nextInt();
        List<Integer> box=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            box.add(s.nextInt());
        }
        
        Arrays.sort(crane,Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());
        
        if(crane[0]<box.get(0)){System.out.print(-1);return;}
        
        while(!box.isEmpty()){
            int move=0;
            for(int i=0;i<n;){
                if(box.get(move)<=crane[i]){
                    i++;
                    box.remove(move);
                    move=0;
                }
                else{
                    move++;
                }
                if(move>=box.size())break;
            }
            day++;
        }
        System.out.print(day);

    }
}