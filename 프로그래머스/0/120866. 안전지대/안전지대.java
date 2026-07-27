class Solution {
    public boolean visited[][];
    
    public int solution(int[][] board) {
        int answer = board.length*board[0].length;
        
        visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    visited[i][j]=true;
                    dfs(i,j);
                }
            }
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(visited[i][j]){
                    answer--;
                }
            }
        }
        
        return answer;
    }
    
    public void dfs(int i,int j){
        int dx[]={-1,0,1,-1,1,-1,0,1};
        int dy[]={-1,-1,-1,0,0,1,1,1};
        
        for(int k=0;k<8;k++){
            int nx=j+dx[k];
            int ny=i+dy[k];
            
            if(nx>=0&&nx<visited[0].length&&ny>=0&&ny<visited.length){
                visited[ny][nx]=true;
            }
        }
        
    }
}