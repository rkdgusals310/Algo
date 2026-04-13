import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int w=s.nextInt();
        boolean block[][]=new boolean[h][w];
        
        for(int i=0;i<w;i++){
            int temp=s.nextInt();
            for(int j=0;j<temp;j++)
            {
                block[j][i]=true;
            }
        }
        
        int count=0;
        for(int i=0;i<h;i++){
            int cnt=0;
            int total=0;
            for(int j=1;j<w;j++){
                if(block[i][j-1]&&!block[i][j]){
                    cnt=1;
                    total=1;
                }
                else if(block[i][j]&&cnt==1){
                    
                    count+=total;
                    //System.out.println(total);
                    total=0;
                    cnt=0;
                    
                }
                else {
                    total++;
                }
                
            }
        }
        System.out.print(count);
    }
}