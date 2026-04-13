import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int nine[]=new int[9];
        int seven[]=new int[7];
        int sum=0;
        for(int i=0;i<9;i++){
            nine[i]=s.nextInt();
            sum+=nine[i];
        }
        sum-=100;
        int a=0;
        int b=0;
        int total=0;
        for(int i=0;i<9;i++){
            
            for(int j=i+1;j<9;j++){
                total=sum-nine[i];
                total-=nine[j];
                if(total==0){
                    a=i;
                    b=j;
                    break;
                }
            }
            if(total==0)break;
        }
        int index=0;
        for(int i=0;i<9;i++){
            if(i!=a&&i!=b){
                seven[index]=nine[i];
                index++;
            }
        }
        Arrays.sort(seven);
        for(int i=0;i<7;i++){
            System.out.println(seven[i]);
        }
        
    }
}