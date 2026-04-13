import java.util.*;

public class Main {
    static char[][] map = new char[5][5];
    static int ans = 0;
    static int[] pick = new int[7];
    static boolean[] visited = new boolean[25];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String s = sc.next();
            for(int j=0;j<5;j++){
                map[i][j] = s.charAt(j);
            }
        }
        comb(0,0);
        System.out.println(ans);
    }

    static void comb(int idx,int cnt){
        if(cnt==7){
            check();
            return;
        }
        if(idx>=25) return;
        pick[cnt] = idx;
        comb(idx+1,cnt+1);
        comb(idx+1,cnt);
    }

    static void check(){
        int sCnt = 0;
        for(int i=0;i<7;i++){
            int x = pick[i]/5;
            int y = pick[i]%5;
            if(map[x][y]=='S') sCnt++;
        }
        if(sCnt<4) return;

        Queue<int[]> q = new LinkedList<>();
        boolean[] vis = new boolean[7];
        q.offer(new int[]{pick[0]/5,pick[0]%5});
        vis[0] = true;
        int cnt = 1;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int d=0;d<4;d++){
                int nx = cur[0]+dx[d];
                int ny = cur[1]+dy[d];
                for(int i=0;i<7;i++){
                    if(!vis[i] && pick[i]/5==nx && pick[i]%5==ny){
                        vis[i] = true;
                        q.offer(new int[]{nx,ny});
                        cnt++;
                    }
                }
            }
        }
        if(cnt==7) ans++;
    }
}
