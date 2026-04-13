import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        boolean paper[][]=new boolean[101][101];
        for(int i=0;i<101;i++){
            Arrays.fill(paper[i],false);
        }
        
        for(int i=0;i<num;i++){
            int n=s.nextInt();
            int m=s.nextInt();
            confetti(paper,n,m);
        }
        int sum=0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                if(paper[i][j])sum+=1;
            }
        }
        System.out.println(sum);
        
        
        
    }
    public static void confetti(boolean paper[][],int n,int m){
        for(int i=n;i<n+10;i++){
            for(int j=m;j<m+10;j++){
                paper[i][j]=true;
            }
        }
    }
}