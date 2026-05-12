class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int a=0;
        int b=0;
        int start=n-1;
        int cnt=0;
        int index=0;
        int first=0;
        //우 하 좌 상
        answer[a][b]=1;
        int num=2;
        while(start!=0){
            index%=4;
            
            for(int i=0;i<start;i++){
                switch(index){
                    case 0:
                        b++;
                        break;
                    case 1:
                        a++;
                        break;
                    case 2:
                        b--;
                        break;
                    case 3:
                        a--;
                        break;
                }
                answer[a][b]=num;
                num++;
            }
            
            cnt++;
            if(first==0){
                cnt=0;
                first=1;
            }
            if(cnt==2){
                start--;
                cnt=0;
            }
            index++;

        }
        return answer;
    }
}