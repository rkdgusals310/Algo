import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            String ox=s.next();
            int score[]=new int[ox.length()];
            int sum=0;
            Arrays.fill(score,0);
            for(int j=0;j<ox.length();j++){
                switch(ox.charAt(j)){
                        case'O':
                            score[j]++;
                            if(j!=0&&ox.charAt(j-1)=='O'){
                                score[j]+=score[j-1];
                            }
                            break;
                        case'X':
                            break;
                }
                
            }
             for(int j=0;j<ox.length();j++){
                 sum+=score[j];
             }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}