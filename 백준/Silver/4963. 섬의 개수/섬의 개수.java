import java.util.*;

public class Main{
    
    public static boolean visited[][];
    public static int island[][];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        while(true){
            int w=s.nextInt();
            int h=s.nextInt();
            int cnt=0;
            if(w==0&&h==0){
                break;
            }
            visited=new boolean[h][w];
            island=new int[h][w];
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    island[i][j]=s.nextInt();
                }
            }
            
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(!visited[i][j]&&island[i][j]==1){
                        dfs(i,j);
                        cnt+=1;
                    }
                }
            }
            sb.append(cnt).append("\n");
            
        }
        System.out.print(sb);
    }
    
    public static void dfs(int h,int w){
        if(visited[h][w]||island[h][w]==0){
            return;
        }
        int dh[]={-1,1,0,0,-1,-1,1,1};
        int dw[]={0,0,-1,1,-1,1,-1,1};
        visited[h][w]=true;
        
        
        
        
        for(int i=0;i<8;i++){
            int nh=h+dh[i];
            int nw=w+dw[i];
            if(nh>=0&&nw>=0&&nh<visited.length&&nw<visited[0].length){
                dfs(nh,nw);
            }
            
        }
    }
    
}