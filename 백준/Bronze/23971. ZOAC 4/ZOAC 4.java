import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int h=s.nextInt();
        int w=s.nextInt();
        int n=s.nextInt();
        int m=s.nextInt();
        
        int startX=1;
        int startY=1;
        int cntX=1;
        int cntY=1;
        
        while(true){
            startX+=n+1;
            
            if(startX>h)break;
            cntX++;
            
        }
        
        while(true){
            startY+=m+1;
            
            if(startY>w)break;
            cntY++;
            
        }
        //System.out.println(startX+" "+startY);
        //System.out.println(cntX+" "+cntY);
        System.out.println(cntY*cntX);
    }
}