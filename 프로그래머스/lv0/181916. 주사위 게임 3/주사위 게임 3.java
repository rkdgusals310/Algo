class Solution {
    public int solution(int a, int b, int c, int d) {
        int arr[]={a,b,c,d};
        int answer = 0;
        int cnt=0;
        int min=a;
        int max=0;
        int p=0;
        int q=0;
        for(int i=0;i<4;i++){
            cnt=0;
            for(int j=0;j<4;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>max){
                max=cnt;
                p=arr[i];
            }
            min=min>arr[i]?arr[i]:min;
        }
        
        switch(max){
            case 1:
                answer=min;
                break;
            case 2:
                int temp[]={-1,-2};
                int j=0;
                for(int i=0;i<4;i++){
                    if(p!=arr[i]){
                        temp[j]=arr[i];
                        j+=1;
                    }
                }
                if(temp[0]==temp[1]){
                    q=temp[0];
                    answer=(p+q)*Math.abs(p-q);
                }
                else{
                    answer=temp[0]*temp[1];
                }
                break;
            case 3:
                for(int i=0;i<4;i++){
                    if(arr[i]!=p){
                        q=arr[i];
                        break;
                    }
                }
                answer=(int)Math.pow(10*p+q,2);
                break;
            case 4:
                answer=1111*a;
                break;
        }
        
        
        return answer;
    }
}