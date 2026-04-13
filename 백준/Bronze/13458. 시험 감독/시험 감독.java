import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int a[]=new int[n];
        double bc[]=new double[2];
        
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<2;i++){
            bc[i]=s.nextDouble();
        }
        long total=1*n;
        for(int i=0;i<n;i++){
            double num=Math.ceil((a[i]-bc[0])/bc[1])>0?Math.ceil((a[i]-bc[0])/bc[1]):0;
            //System.out.println(num);
            total+=num;
        }
        
        System.out.println(total);
    }
}
//엣지 케이스 
// 음수