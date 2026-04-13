import java.util.*;

public class Main{
    public static int move[]={2,2,2,2};
    public static int temp[];
    public static void  main(String args[]){
        Scanner s=new Scanner(System.in);
        int cogwheel[][]=new int[4][8];
        for(int i=0;i<cogwheel.length;i++){
            String str=s.next();
            for(int j=0;j<cogwheel[0].length;j++){
                // N 0 ,S 1
                cogwheel[i][j]=str.charAt(j)-'0';
            }
        }
        
        int test=s.nextInt();
        for(int t=0;t<test;t++){
            int number=s.nextInt();
            int direction=s.nextInt();// 시계방향 1, 반시계방향 -1 
            temp=new int[4];
            cogwheelStatus(cogwheel,number-1,direction);
        }
        int sum=0;
        for(int i=0;i<4;i++){
            if(cogwheel[i][(move[i]+6)%8]==1){
                switch(i){
                    case 0:
                        sum+=1;
                        break;
                    case 1:
                        sum+=2;
                        break;
                    case 2:
                        sum+=4;
                        break;
                        
                    case 3:
                        sum+=8;
                        break;
                }

            }
        }
        System.out.print(sum);       
    }
    
    //회전시 같은 극이면 멈춰있고 다른 극이면 회전한다.(하나는 시계, 하나는 반시계방향으로 회전함)
    public static void cogwheelStatus(int cogwheel[][],int number,int direction){
        
        temp[number]=direction;
        
        for(int i=number;i<3;i++){
            if(cogwheel[i][move[i]]==cogwheel[i+1][(move[i+1]+4)%8])break;
            temp[i+1]=-1*temp[i];
            
        }
        for(int i=number;i>0;i--){
            if(cogwheel[i-1][move[i-1]]==cogwheel[i][(move[i]+4)%8])break;
            temp[i-1]=-1*temp[i];
            
        }
        for(int i=0;i<4;i++){
            if(temp[i]==1){
                move[i]=(move[i]+7)%8;
                
            }
            else if(temp[i]==-1){
                move[i]=(move[i]+1)%8;
            }
        }
        
        

    }
}