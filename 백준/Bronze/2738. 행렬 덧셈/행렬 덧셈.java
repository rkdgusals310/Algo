import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
       
        int matrixSum[][]=new int[n*2][m*2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixSum[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int num=s.nextInt();
                matrixSum[i][j]+=num;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrixSum[i][j]+" ");
            }System.out.println();
        }
    }
}