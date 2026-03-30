import java.util.*;

public class Main{
    public static int arr[];
    public static int lotto[]=new int[6];
    public static StringBuilder sb=new StringBuilder();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int k=0;
        do{
            k=sc.nextInt();
            arr=new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }
            dfs(0);
            sb.append("\n");
        }while(k!=0);
        System.out.print(sb);
    }
    public static void dfs(int depth){
        if(depth==6){
            for(int i=0;i<6;i++){
                sb.append(lotto[i]).append(" ");
            }sb.append("\n");
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(depth==0){
                lotto[depth]=arr[i];
                dfs(depth+1);
            }
            else{
                if(lotto[depth-1]<arr[i]){
                    lotto[depth]=arr[i];
                    dfs(depth+1);
                }
            }
        }
    }
}