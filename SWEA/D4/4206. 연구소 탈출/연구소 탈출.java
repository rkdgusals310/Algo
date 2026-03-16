import java.util.*;

class Solution
{
    public static int map[][];
    public static int status[]=new int[2];
	public static void main(String args[]) throws Exception
	{
        StringBuilder sb=new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int m=sc.nextInt();
            int startX=0; // 삼성이의 처음 위치 X좌표
            int startY=0;// 삼성이의 처음 위치  Y좌표
            status[0]=3;
            map=new int[n][m];
            for(int i=0;i<n;i++){
            	for(int j=0;j<m;j++){
                	map[i][j]=sc.nextInt();
                    if(map[i][j]==3){
                    	startX=j;
                        startY=i;
                    }
                }
            }
            bfs(startX,startY,0);
            String str="";
			switch(status[0]){
                case 1:
                    str+=status[1];
                    break;
                case 2:
                    str="ZOMBIE";
                    break;
                case 3:
                    str="CANNOT ESCAPE";
                    break;
            }
			sb.append("#").append(test_case).append(" ").append(str).append("\n");
		}
        System.out.print(sb);
	}
    /*
    	이루어져야할 로직
        - 바이러스가 퍼지는 로직
        	- 동시에 바이러스가 퍼지는 
        - 삼성이가 탈출하는 로직
    */
    public static void zombie(){
        Queue<int[]>q=new LinkedList<>();
        int dx[]={0,0,-1,1};// 상하좌우
        int dy[]={-1,1,0,0};
        
    	for(int i=0;i<map.length;i++){
        	for(int j=0;j<map[0].length;j++){
            	if(map[i][j]==2){
                	q.offer(new int[]{j,i});
                } 
            }
        }
       int size=q.size();
        for(int i=0;i<size;i++){
        	int xyz[]=q.poll();
            for(int j=0;j<4;j++){
            	int nx=xyz[0]+dx[j];
                int ny=xyz[1]+dy[j];
                if(nx>=0&&nx<map[0].length&&ny>=0&&ny<map.length){
                	if(map[ny][nx]==0){
                    	map[ny][nx]=2;
                    }
                }
                
            }
        }
    }
    public static void bfs(int startX,int startY,int sec){
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{startX,startY,sec});
        map[startY][startX]=1;
        int dx[]={0,0,-1,1};// 상하좌우
        int dy[]={-1,1,0,0};
        
        while(!q.isEmpty()){
            
            int xyz[]=q.poll();
            int x=xyz[0];
            int y=xyz[1];
            int z=xyz[2];
            zombie();
        	for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
				if(nx>=0&&nx<map[0].length&&ny>=0&&ny<map.length){
                	if(map[ny][nx]==0){
                    	map[ny][nx]=1;
                        q.offer(new int[]{nx,ny,z+1});
                    }
                    else if(map[ny][nx]==2){
                    	status[0]=2;
                    	status[1]=z+1;
                    }
                    
                }
                else{
                	status[0]=1;
                    status[1]=z+1;
                    return;
                }
            }
        }
        
    }
}