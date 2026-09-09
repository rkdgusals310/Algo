import java.util.*;
class Solution {
    public int arr[]=new int[2];
    int answer=0;
    public int solution(int[][] dots) {

        dfs(0,0,dots);   
        return answer;
    }
    public void dfs(int depth,int num,int[][] dots){
        if(depth==2){
            int x=arr[0];
            int y=arr[1];
            int tmp[]=new int[2];
            int temp=0;
            boolean visited[]=new boolean[4];
            visited[x]=true;
            visited[y]=true;
            
            float n1=(float)(dots[x][1] -dots[y][1])/(float)(dots[x][0]-dots[y][0]);
            for(int i=0;i<4;i++){
                if(!visited[i]){
                    tmp[temp]=i;
                    temp++;
                }
            }
            x=tmp[0];
            y=tmp[1];
            
            float n2=(float)(dots[x][1] -dots[y][1])/(float)(dots[x][0]-dots[y][0]);
            if(n1==n2){answer= 1;}
            return;
        }
        
        for(int i=num;i<4;i++){
            arr[depth]=i;
            dfs(depth+1,i+1,dots);
        }
    }
}