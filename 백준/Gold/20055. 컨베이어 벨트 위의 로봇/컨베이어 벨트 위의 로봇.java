import java.util.*;

public class Main{
    public static int zero=0;
    public static int beltN=0;
    public static int robotN=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int k=s.nextInt();
        
        int cnt=0;

        
        int belt[]=new int[n*2];
        boolean robot[]=new boolean[n];
        
        for(int i=0;i<n*2;i++){
            belt[i]=s.nextInt();
        }

        
        while(zero<k){
            // 벨트 회전
            rotate(belt,robot,n);

            // 로봇 이동
            moveRobot(belt,robot,n);


            //올리는 위치에 로봇 올리기
            if(belt[beltN]>0&&!robot[0]){
                robot[0]=true;
                belt[beltN]--;
            }
            
            zeroN(belt,n);
            cnt++;
            
        }
        System.out.println(cnt);
    }
    
    public static void zeroN(int belt[],int n){
        int cnt=0;
        for(int i=0;i<2*n;i++){
            if(belt[i]==0){cnt++;}
        }
        
        zero=cnt;
    }
    
    public static void rotate(int belt[],boolean robot[],int n){
        beltN=(beltN-1+(2*n))%(2*n);
        
        
        for(int i=n-1;i>=0;i--){
            if(robot[i]){
                if(i+1>n-1){
                    robot[i]=false;
                }
                else{
                    robot[i]=false;
                    robot[i+1]=true;
                }
            }
            else{
                if(i+1<n){
                   robot[i+1]=false; 
                }
                
            }
        }
        
    }
    public static void moveRobot(int belt[],boolean robot[],int n){
            for(int i=n-1;i>=0;i--){
                if(robot[i]){
                    if(i+1>n-1){
                        robot[i]=false;
                    }
                    else{
                        if(!robot[i+1]&&belt[(beltN+i+1)%(2*n)]>0){
                            robot[i]=false;
                            robot[i+1]=true;
                            belt[(beltN+i+1)%(2*n)]--;
                        }
                        
                    }
                }
            }
        
    }
}