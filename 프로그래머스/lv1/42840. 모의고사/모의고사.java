class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int one[]={1,2,3,4,5};
        int two[]={2,1,2,3,2,4,2,5};
        int three[]={3,3,1,1,2,2,4,4,5,5};
        int score[]={0,0,0};
        
        for(int i=0;i<answers.length;i++){
            score[0]=one[i%5]==answers[i]?score[0]+1:score[0];
            score[1]=two[i%8]==answers[i]?score[1]+1:score[1];
            score[2]=three[i%10]==answers[i]?score[2]+1:score[2];
        }
        int max=score[0];
        int cnt=0;
        for(int i=1;i<3;i++){
            if(score[i]>max)max=score[i];
            
        }
        
        for(int i=0;i<3;i++){
            if(max==score[i]){cnt++;}
        }
        
        answer=new int[cnt];
        cnt=0;
        for(int i=0;i<3;i++){
            if(max==score[i]){answer[cnt]=i+1;cnt++;}
        }
            

        return answer;
    }
}