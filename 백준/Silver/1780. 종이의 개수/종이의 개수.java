import java.util.*;

public class Main{
    static int[][] paper;
    static int[] cnt=new int[3];

    static void solve(int r,int c,int n){
        int v=paper[r][c];
        boolean same=true;
        for(int i=r;i<r+n&&same;i++){
            for(int j=c;j<c+n;j++){
                if(paper[i][j]!=v){
                    same=false;
                    break;
                }
            }
        }
        if(same){
            cnt[v+1]++;
            return;
        }
        int m=n/3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                solve(r+i*m,c+j*m,m);
            }
        }
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        paper=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                paper[i][j]=s.nextInt();
            }
        }
        solve(0,0,n);
        sb.append(cnt[0]).append('\n').append(cnt[1]).append('\n').append(cnt[2]);
        System.out.print(sb);
    }
}
