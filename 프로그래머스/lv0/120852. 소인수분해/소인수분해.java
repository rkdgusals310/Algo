class Solution {
    public int[] solution(int n) {
        int num=1;
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=2;i<=n;){
            if(n%i==0){
                if(cnt==0){
                    sb.append(i).append(" ");
                    cnt++;
                    num++;
                }
                n/=i;
            }
            else{
                cnt=0;

                i++;
            }
        }
        int[] answer = new int[num-1];
        int ind=0;
        String str[]=sb.toString().split(" ");
        for(String stri:str){
            answer[ind]=Integer.parseInt(stri);ind++;
        }
        return answer;
    }
}