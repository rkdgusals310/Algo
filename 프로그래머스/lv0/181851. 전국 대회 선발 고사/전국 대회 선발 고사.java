class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int index=0;
        int n=1;
        int arr[]=new int[3];
        
        while(index<3){
            for(int i=0;i<rank.length;i++){
                if(n==rank[i]){
                    if(attendance[i]){
                        arr[index]=i;
                        index++;
                    }
                    n++;
                    break;

                }
            }
        }
        answer=10000*arr[0]+100*arr[1]+arr[2];
        return answer;
    }
}