import java.util.*;

public class Main{
    public static int[][] downTown;
    public static boolean[][] visited1;
    public static int shop=0;
    public static int m=0;
    public static int cnt=0;
    public static int chickenDistance=Integer.MAX_VALUE;
    public static List<int[]> list=new LinkedList<>();
    public static List<int[]> chickens=new ArrayList<>();

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        m=s.nextInt();

        downTown=new int[n+1][n+1];
        visited1=new boolean[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                downTown[i][j]=s.nextInt();
                if(downTown[i][j]==2){
                    shop++;
                    chickens.add(new int[]{i,j});
                }
            }
        }

        if(m>shop){ System.out.println(0); return; }

        cnt=shop-m;

        if(cnt==0){
            int sum=0;
            for(int i=1;i<downTown.length;i++){
                for(int j=1;j<downTown[0].length;j++){
                    if(downTown[i][j]==1){
                        sum+=nearest(i,j);
                    }
                }
            }
            System.out.println(sum);
            return;
        }

        for(int i=0;i<cnt;i++) list.add(new int[2]);

        dfs(0,1,1);
        System.out.println(chickenDistance);
    }

    public static void dfs(int depth,int x,int y){
        if(depth==cnt){
            for(int i=0;i<list.size();i++){
                int r=list.get(i)[0], c=list.get(i)[1];
                downTown[r][c]=0;
            }

            int sum=0;
            for(int i=1;i<downTown.length;i++){
                for(int j=1;j<downTown[0].length;j++){
                    if(downTown[i][j]==1){
                        sum+=nearest(i,j);
                        if(sum>=chickenDistance){
                            for(int t=0;t<list.size();t++){
                                int r=list.get(t)[0], c=list.get(t)[1];
                                downTown[r][c]=2;
                            }
                            return;
                        }
                    }
                }
            }

            for(int i=0;i<list.size();i++){
                int r=list.get(i)[0], c=list.get(i)[1];
                downTown[r][c]=2;
            }

            chickenDistance=Math.min(chickenDistance,sum);
            return;
        }

        for(int i=x;i<downTown.length;i++){
            for(int j=(i==x?y:1); j<downTown[0].length; j++){
                if(!visited1[i][j] && downTown[i][j]==2){
                    visited1[i][j]=true;
                    list.get(depth)[0]=i;
                    list.get(depth)[1]=j;
                    dfs(depth+1,i,j+1);
                    visited1[i][j]=false;
                }
            }
        }
    }

    static int nearest(int x,int y){
        int best=Integer.MAX_VALUE;
        for(int[] c: chickens){
            int cx=c[0], cy=c[1];
            if(downTown[cx][cy]==2){
                int d=Math.abs(x-cx)+Math.abs(y-cy);
                if(d<best) best=d;
            }
        }
        return best;
    }
}
