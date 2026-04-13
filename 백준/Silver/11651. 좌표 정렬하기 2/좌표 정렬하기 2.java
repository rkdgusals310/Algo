import java.util.*;
class Pair{
    public int first;
    public int second;
    
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        List<Pair> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            list.add(new Pair(y,x));
        }
        Collections.sort(list,(a,b)->{
            if(a.first!=b.first)return a.first-b.first;
            return a.second-b.second;
        });
        
        for(int i=0;i<n;i++){
            sb.append(list.get(i).second+" "+list.get(i).first).append("\n");
        }
        System.out.print(sb);
    }
}