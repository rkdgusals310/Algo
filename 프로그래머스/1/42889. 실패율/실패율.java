import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[][] temp = new float[N][2];
        
        int stageCnt[]=new int[N+1];
        
        for(int i=0;i<stages.length;i++){
            stageCnt[stages[i]-1]++;
        }
        float len=stages.length;
        float cnt=0f;
        for(int i=0;i<N;i++){
            if(len-cnt==0){
                temp[i][0]=0;
                temp[i][1]=i+1;
                continue;
            }
            temp[i][0]=stageCnt[i]/(len-cnt);
            temp[i][1]=i+1;
            cnt+=stageCnt[i];
            //System.out.println(temp[i][0]+" "+stageCnt[i]+" "+len+" "+cnt);
        }
        //System.out.println(Arrays.deepToString(temp));
        Arrays.sort(temp,(a,b)->{
            if(a[0]==b[0])return Float.compare(a[1],b[1]);
            return Float.compare(b[0],a[0]);
        });
        for(int i=0;i<N;i++){
            answer[i]=(int)temp[i][1];
        }
        return answer;
    }
}