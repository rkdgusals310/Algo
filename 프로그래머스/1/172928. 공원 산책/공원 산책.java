import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int map[][]=new int[park.length][park[0].length()];
        Arrays.fill(answer,-1);
        int x=0;
        int y=0;

        for(int i=0;i<map.length;i++){
            String str[]=park[i].split("");
            for(int j=0;j<map[i].length;j++){
                if(str[j].equals("S")){
                    x=i;
                    y=j;
                    map[i][j]=1;
                }
                else if(str[j].equals("O")){map[i][j]=1;}
                else if(str[j].equals("X")){map[i][j]=0;}
            }
        }
        System.out.println(Arrays.deepToString(map));
        
        int dx[]={-1,1,0,0}; //상 하 좌 우
        int dy[]={0,0,-1,1};

        for(int i=0;i<routes.length;i++){
            String str[]=routes[i].split(" ");
            int nx=x;
            int ny=y;
            int index=0;

            switch(str[0]){
                case "N":
                    index=0;
                    break;
                case "S":
                    index=1;
                    break;
                case "W":
                    index=2;
                    break;
                case "E":
                    index=3;
                    break;
                default:
                    break;
            }
            int breakN=0;
            int cnt=0;
            while(true){
                if(cnt==Integer.parseInt(str[1])){
                    break;
                }
                nx+=dx[index];
                ny+=dy[index];
                if(nx>=0&&nx<map.length&&ny>=0&&ny<map[0].length){
                    if(map[nx][ny]==0){
                        breakN=1;
                        break;
                    }
                }
                else{
                    breakN=1;
                    break;
                }
                cnt++;
            }
            if(breakN==0){
                for(int k=0;k<Integer.parseInt(str[1]);k++){
                    x+=dx[index];
                    y+=dy[index];
                }
            }
            
        }
        answer=new int[]{x,y};
        
        return answer;
    }
}