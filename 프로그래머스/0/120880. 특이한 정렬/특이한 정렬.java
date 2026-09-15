class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int [][] temp=new int[10001][2];
        
        for(int i=0;i<numlist.length;i++){
            int num=n-numlist[i];
            num=num>=0?num:num*(-1);
            
            if(temp[num][0]==0){
                temp[num][0]=numlist[i];
            }
            else{
                if(temp[num][0]>numlist[i])temp[num][1]=numlist[i];
                else{
                    temp[num][1]=temp[num][0];
                    temp[num][0]=numlist[i];
                }
            }
        }
        int cnt=0;
        
        for(int i=0;i<10001;i++){
            if(cnt==numlist.length)break;
            if(temp[i][0]==0)continue;
            for(int j=0;j<2;j++){
                if(temp[i][j]==0)break;
                answer[cnt]=temp[i][j];
                cnt++;
            }
        }
        
        return answer;
    }
}