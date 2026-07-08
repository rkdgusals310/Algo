class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer ={};
        
        int len=0;
        int x=0;
        int y=0;
        
        for(int i=0;i<keyinput.length;i++){
            int nx=0;
            int ny=0;
            switch(keyinput[i]){
                case "left":
                    nx=-1;
                    break;
                case "right":
                    nx=1;
                    break;
                case "up":
                    ny=1;
                    break;
                case "down":
                    ny=-1;
                    break;
            }
            if(nx+x>=0-board[0]/2&&nx+x<=board[0]/2&&ny+y>=0-board[1]/2&&ny+y<=board[1]/2){
                x+=nx;
                y+=ny;
            }
        }
        answer=new int[]{x,y};
        return answer;
    }
}