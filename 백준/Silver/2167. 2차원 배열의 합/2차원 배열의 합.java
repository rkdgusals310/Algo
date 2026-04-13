import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        int kk=s.nextInt();
        for(int i=0;i<kk;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int d=s.nextInt();
            int sum=0;
            for(int j=a-1;j<c;j++){
                for(int k=b-1;k<d;k++){
                    sum+=arr[j][k];
                }
            }
            System.out.println(sum);
        }
    }
}