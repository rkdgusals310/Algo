import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int test=s.nextInt();
        
        for(int t=0;t<test;t++){
            int k=s.nextInt();//층
            int n=s.nextInt();//호  
             
            int apt[][]=new int[k+1][n+1];
            for(int i=1;i<=n;i++){
                apt[0][i]=i;
            }        
            for(int j=1;j<=k;j++){
                for(int i=1;i<=n;i++){
                    apt[j][i]=apt[j][i-1]+apt[j-1][i];
                }
            }
            System.out.println(apt[k][n]);
            //System.out.println(Arrays.deepToString(apt));
        }
    }
}