import java.util.*;

// 
public class Main{
    public static int map[][]; // R x C 크기 공간 
    public static int tempMap[][]; // R x C 크기 공간 임시 공간
    public static int airPurifier[]=new int[2]; // 공기청정기 좌표
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int r=s.nextInt(); // 행
        int c=s.nextInt(); // 열
        int t=s.nextInt(); // 몇초?
        int airIndex=0;
        
        map=new int[r][c];
        tempMap=new int[r][c];
        
        // 공간에 존재하는 미세먼지와 공기청정기 입력
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                map[i][j]=s.nextInt();
                if(map[i][j]==-1){
                    // 공기 청정기는 -1
                    airPurifier[airIndex]=i;
                    airIndex++;
                }
                
            }
        }
        
        for(int repeat=0;repeat<t;repeat++){
            // 1초동안 아래 행위 반복 총 t초 동안
            // 1) 미세먼지 확산
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(map[i][j]>0){
                        spreadDust(i,j);
                    }
                }
            }
            addDust();
            
            // 2)공기청정기 작동 
            airPurifier_operation();
            
        }
        // t초 동안 반복 후 공간에 남아있는 미세먼지 카운트 
        System.out.print(dustCount());
    }
    public static void spreadDust(int x,int y){
        int dust=map[x][y];
        int spread=dust/5;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            //공기청정기 존재 or 칸 존재 하지 않는다면 확산 x  
            if(nx>=0&&ny>=0&&nx<map.length&&ny<map[0].length&&map[nx][ny]!=-1){
                tempMap[nx][ny]+=spread;
                map[x][y]-=spread;
            }
            
        }   
    }
    public static void addDust(){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                map[i][j]+=tempMap[i][j];
            }
            Arrays.fill(tempMap[i],0);
        }
    }
    public static void airPurifier_operation(){
        
        int r=map.length, c=map[0].length;
        int top=airPurifier[0], bot=airPurifier[1];

        for(int i=top-1;i>0;i--) map[i][0]=map[i-1][0];
        for(int j=0;j<c-1;j++) map[0][j]=map[0][j+1];
        for(int i=0;i<top;i++) map[i][c-1]=map[i+1][c-1];
        for(int j=c-1;j>1;j--) map[top][j]=map[top][j-1];
        map[top][1]=0;
        map[top][0]=-1;

        for(int i=bot+1;i<r-1;i++) map[i][0]=map[i+1][0];
        for(int j=0;j<c-1;j++) map[r-1][j]=map[r-1][j+1];
        for(int i=r-1;i>bot;i--) map[i][c-1]=map[i-1][c-1];
        for(int j=c-1;j>1;j--) map[bot][j]=map[bot][j-1];
        map[bot][1]=0;
        map[bot][0]=-1;

        
    }
    public static int dustCount(){
        int total=0;
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                total+=map[i][j];
            }
        }
        return total+2;
    } // 그냥 완전 탐색해도 ㄱㅊ? -> ㅇㅇ 범위가 크지 않음
}