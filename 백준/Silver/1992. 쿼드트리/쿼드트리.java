import java.util.*;

public class Main{
    static char[][] map;
    static StringBuilder sb=new StringBuilder();

    static void solve(int r,int c,int n){
        char v=map[r][c];
        boolean same=true;
        for(int i=r;i<r+n&&same;i++){
            for(int j=c;j<c+n;j++){
                if(map[i][j]!=v){
                    same=false;
                    break;
                }
            }
        }
        if(same){
            sb.append(v);
            return;
        }
        int m=n/2;
        sb.append('(');
        solve(r,c,m);
        solve(r,c+m,m);
        solve(r+m,c,m);
        solve(r+m,c+m,m);
        sb.append(')');
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        map=new char[n][n];
        for(int i=0;i<n;i++){
            String str=s.next();
            for(int j=0;j<n;j++){
                map[i][j]=str.charAt(j);
            }
        }
        solve(0,0,n);
        System.out.print(sb);
    }
}
