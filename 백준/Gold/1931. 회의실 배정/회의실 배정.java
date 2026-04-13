import java.util.*;

class Reservation{
    int startT;
    int endT;

    Reservation(int startT,int endT){
        this.startT=startT;
        this.endT=endT;

    }
}
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        Reservation[] r=new Reservation[n];
        
        int count=1;
        for(int i=0;i<n;i++){
            int startT=s.nextInt();
            int endT=s.nextInt();
            r[i]=new Reservation(startT,endT);
        }
        Arrays.sort(r,(a,b)->{
        if(a.endT!=b.endT)return a.endT-b.endT;
        return a.startT-b.startT;}
        );
        
        int select=r[0].endT;
        for(int i=1;i<n;i++){
            if(select<=r[i].startT){
                count++;
                select=r[i].endT;
            }

        }

        System.out.print(count);
    }
    
}