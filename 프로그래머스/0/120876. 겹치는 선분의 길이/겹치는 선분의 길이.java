class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int cnt[]=new int[201];
        for(int i=0;i<3;i++){
            int start=lines[i][0];
            int end=lines[i][lines[0].length-1];
            for(int j=start;j<end;j++){
                cnt[j+100]++;
            }
        }
        
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>1)answer++;
        }
        return answer;
    }
}