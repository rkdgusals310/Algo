import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Queue<int[]> tail=new LinkedList<>();
        
        int n=s.nextInt();
        int k=s.nextInt();
        int time=0;
        boolean visited[][]=new boolean[n+1][n+1];
        boolean map[][]=new boolean[n+1][n+1];
        char move[]=new char[10_001];
        visited[1][1]=true;
        int head[]=new int[]{1,1};
        int direction=0; // 0,1,2,3 우 하 좌 상
        
        // 사과 위치 존재(true) 존해하지 않음(false)
        for(int i=0;i<k;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            map[x][y]=true;
        }
        
        //뱀 방향 전환 지시 입력력
         int l=s.nextInt();
        for(int i=0;i<l;i++){
            int t=s.nextInt();
            move[t]=s.next().charAt(0);
        }
        
        tail.offer(new int[]{head[0],head[1]});
        while(true){

            time++;
            switch(direction){
                case 0:   // 오른쪽 방향
                    head[1]+=1;
                    break;
                case 1: // 아래쪽 방향
                    head[0]+=1;
                    break;
                case 2:// 왼쪽 방향
                    head[1]-=1;
                    break;
                case 3: // 위쪽 방향
                    head[0]-=1;
                    break;
            }
            tail.offer(new int[]{head[0],head[1]});
            
            if(head[1]<=0||head[0]<=0||head[1]>n||head[0]>n)break; //벽에 충돌하는 경우
            
            
            
            
            // 뱀이 본인 몸통과 충돌하는 경우
            if(visited[head[0]][head[1]]){
                break;
            }
            if(!map[head[0]][head[1]]){
                int xy[]=tail.poll();
                visited[xy[0]][xy[1]]=false;
            }else{
                map[head[0]][head[1]]=false;
            }
            visited[head[0]][head[1]]=true;
            
            // 뱀 방향 전환 지시시
            if(move[time]=='D'||move[time]=='L'){
                if(move[time]=='D'){
                    direction=(direction+1)%4;
                }
                else{
                    direction=(direction-1+4)%4;
                }
            }
            
        
        }
        System.out.println(time);
    }
}