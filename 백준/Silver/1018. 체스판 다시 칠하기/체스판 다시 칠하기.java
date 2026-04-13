import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        
        boolean bw[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            String str[]=s.next().split("");
            for(int j=0;j<m;j++){
                if(str[j].equals("B")){bw[i][j]=true;}
                else{bw[i][j]=false;}
            }
        }
        int min=n*m+1;
        int x=n-8;
        int y=m-8;
        for(int i=0;i<=x;i++){
            for(int q=0;q<=y;q++){
            int cnt=0;
            int cnt2=0;
            for(int j=0;j<8;j++){
                for(int k=0;k<8;k++){
                    if((i+j+k+q)%2==0){
                        if(!bw[i+j][k+q])cnt++;
                    }
                    else{
                        if(bw[i+j][k+q])cnt++;
                    }
                    if((i+j+k+q)%2==0){
                        if(bw[i+j][k+q])cnt2++;
                    }
                    else{
                        if(!bw[i+j][k+q])cnt2++;
                    }
                }
                
            }
            min=min>cnt2?cnt2:min;
            min=min>cnt?cnt:min;
            }
        }
        
     
        System.out.println(min);
    }
}