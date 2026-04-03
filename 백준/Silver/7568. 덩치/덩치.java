import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int kg[]=new int[n];
        int cm[]=new int[n];
        int rank[]=new int[n];
        Arrays.fill(rank,1);
        for(int i=0;i<n;i++){
            kg[i]=s.nextInt();
            cm[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(kg[i]<kg[j]&&cm[i]<cm[j]){
                    rank[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(rank[i]+" ");
        }
    }
    
}