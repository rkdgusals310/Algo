import java.util.*;

public class Main{
    public static int map[][];
    public static int cnt=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int l=s.nextInt();
        map=new int[n][n];
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int breakN=0;
            Arrays.fill(visited,false);
            for(int j=1;j<n;j++){
                if(map[i][j]-map[i][j-1]>1||map[i][j-1]-map[i][j]>1){
                  breakN++;
                  break;
               }

               
               if(map[i][j]!=map[i][j-1]){
                   if(map[i][j]-map[i][j-1]==1||map[i][j-1]-map[i][j]==1){
                       if(map[i][j]<map[i][j-1]){
                           int count=0;
                           for(int k=0;k<l;k++){
                               if(j+k<n&&map[i][j+k]==map[i][j]&&!visited[j+k]){
                                   count++;
                               }
                               else{break;}
                           }
                           if(count!=l){breakN++;break;}
                           else{
                               for(int k=0;k<l;k++){
                                   visited[j+k]=true;
                           }
                               
                           }
                       }
                       else{
                           int count=0;
                           for(int k=0;k<l;k++){
                               if(j-k-1>=0&&map[i][j-k-1]==map[i][j-1]&&!visited[j-k-1]){
                                   count++;
                               }
                               else{break;}
                           }
                           if(count!=l){breakN++;break;}
                           else{
                               
                               for(int k=0;k<l;k++){
                                   if(j-k-1>=0){
                                       visited[j-k-1]=true;
                                   }
                                   else{breakN++;
                                        break;
                                       
                                   }
                                }
                           }
                           
                       }
                       
                       
                   }
                   
               }

            }
            if(breakN==0)cnt++;
        }
        for(int i=0;i<n;i++){
            int breakN=0;
            Arrays.fill(visited,false);
            for(int j=1;j<n;j++){
                if(map[j][i]-map[j-1][i]>1||map[j-1][i]-map[j][i]>1){
                  breakN++;
                  break;
               }
               
               if(map[j][i]!=map[j-1][i]){
                   if(map[j][i]-map[j-1][i]==1||map[j-1][i]-map[j][i]==1){
                       if(map[j][i]<map[j-1][i]){
                           int count=0;
                           for(int k=0;k<l;k++){
                               if(j+k<n&&map[j+k][i]==map[j][i]&&!visited[j+k]){
                                   count++;
                               }
                               else{break;}
                           }
                           if(count!=l){breakN++;break;}//이부분이 같으면 연속인데 연속일때 패싱하는 분기가 필요요
                           else{
                               for(int k=0;k<l;k++){
                                   visited[j+k]=true;
                           }
                               
                           }
                       }
                       else{
                           int count=0;
                           for(int k=0;k<l;k++){
                               if(j-k-1>=0&&map[j-1-k][i]==map[j-1][i]&&!visited[j-k-1]){
                                   count++;
                               }
                               else{break;}
                           }
                           if(count!=l){breakN++;break;}
                           else{
                               
                               for(int k=0;k<l;k++){
                                   if(j-k-1>=0){
                                       visited[j-k-1]=true;
                                   }
                                   else{breakN++;
                                        break;
                                       
                                   }
                                }
                           }
                           
                       }
                       
                       
                   }
               }
               
               
            }
            if(breakN==0)cnt++;
        }
        
        
        
        
        System.out.print(cnt);
        
    }
}