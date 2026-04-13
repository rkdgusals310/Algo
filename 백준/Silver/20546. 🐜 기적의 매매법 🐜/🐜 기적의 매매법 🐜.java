import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int seed=s.nextInt();
        int duck[]=new int[14];
        for(int i=0;i<14;i++){
            duck[i]=s.nextInt();
        }
        int junSeed=jun(seed,duck);
        int seongSeed=seong(seed,duck);
        if(junSeed>seongSeed)System.out.print("BNP");
        else if(junSeed<seongSeed)System.out.print("TIMING");
        else System.out.print("SAMESAME");
    }
   public static int jun(int seed,int duck[]){
       int buy=0;
       for(int i=0;i<duck.length;i++){
           if(seed>duck[i]){
               buy=seed/duck[i];
               seed=seed%duck[i];
           }
       }
       return buy*duck[13]+seed;
   }
   public static int seong(int seed,int duck[]){
       int buy=0;
       int up=0;
       int down=0;
       for(int i=0;i<duck.length;i++){
           if(down==3){
               if(seed>duck[i]){
                   buy=seed/duck[i];
                   seed=seed%duck[i];
               }down=0;
           }
           if(up==3){
               seed+=buy*duck[i];
               up=0;
           }
           
           if(i!=0&&duck[i]<duck[i-1]){down++;up=0;}
           else if(i!=0&&duck[i]>duck[i-1]){up++;down=0;}
           else{down=0;up=0;}
           
       }
       return buy*duck[13]+seed;
   }
}