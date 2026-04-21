class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int dup=0;
        int index=0;
        int cnt[]=new int[1001];
        for(int i=0;i<array.length;i++){
            cnt[array[i]]++;
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>answer){
                answer=cnt[i];
                index=i;
            }
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==answer){
                dup++;
            }
        }
        answer=dup==1?index:-1;
        return answer;
    }
}