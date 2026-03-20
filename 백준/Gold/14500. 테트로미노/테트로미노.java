/*
    크기가 1×1인 정사각형을 여러 개 이어서 붙인 도형을 폴리오미노라고한다.
    폴리오미노는 다음과 같은 조건을 만족해야한다.
    - 정사각형은 서로 겹치면 안된다.
    - 도형은 모두 연결되어 있어야한다.
    - 정사각형의 변끼리 연결되어 있어야 한다. 즉, 꼭짓점과 꼭짓점만 맞닿아 있으면 안된다.
    
    정사각형 4개를 이어 풀인 폴리리오미노를 테크로미노라고 한다.
    
    이때 N x M인 종이 위에 각 칸에는 정수가 하나씩 쓰여져 있는데
    테크로미노 하나를 종이위에 놓아서 얻을 수 있는 정수의 최대 합을 구하는 프로그램을 작성하여라.
*/

/*
    최대값 
    4개를 선택해서 합을 구하며되는데 
    미로 문제처럼 이동하는데 dfs를 활용한다면?
    아래와 같이 문제해결시
    5가지 모형중 4가지는 가능하나 ㅜ 해당 모양은 탐색 불가능
    추가해주면 해결가능?
*/


import java.util.*;

public class Main{
    public static int sum[]=new int[4];
    public static int paper[][];
    public static boolean visited[][];
    public static int max=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int m=s.nextInt();
        paper=new int[n][m];
        visited=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                paper[i][j]=s.nextInt();
            }
        }
        exce();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dfs(j,i,0);
            }
        }
        
        System.out.print(max);
    }
    public static void dfs(int x,int y,int depth){
        if(depth==4){
            int sumTotal=0;
            for(int i=0;i<4;i++)sumTotal+=sum[i];
            max=sumTotal>max?sumTotal:max;
            return;
        }
        
        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};

        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&nx<paper[0].length&&ny>=0&&ny<paper.length){
                if(!visited[ny][nx]){
                    visited[ny][nx]=true;
                    sum[depth]=paper[ny][nx];
                    dfs(nx,ny,depth+1);
                    visited[ny][nx]=false;
                }
            }
        }
    }
    
    public static void exce(){
        
        int temp[]=new int[4];
        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};
        for(int i=0;i<paper.length;i++){
            for(int j=0;j<paper[0].length;j++){
                int sum=paper[i][j];
                int cnt=0;
                Arrays.fill(temp,0);
                for(int k=0;k<4;k++){
                    int nx=j+dx[k];
                    int ny=i+dy[k];
                    if(nx>=0&&nx<paper[0].length&&ny>=0&&ny<paper.length){
                        temp[k]=paper[ny][nx];
                        cnt++;
                    }
                }
                
                int tempSum=paper[i][j];
                if(cnt==3){
                    for(int l=0;l<4;l++){
                        sum+=temp[l];
                    }
                    max=max>sum?max:sum;
                }
                else if(cnt==4){
                    for(int l=0;l<4;l++){
                        tempSum+=temp[l];
                    }
                    for(int l=0;l<4;l++){
                        max=tempSum-temp[l]>max?tempSum-temp[l]:max;
                    }
                }
            }
        }
    }
}