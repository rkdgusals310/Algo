import java.util.*;
public class Main{
    public static void main(String args[]){
        boolean self[]=new boolean[10001];
        StringBuilder sb=new StringBuilder();
        Arrays.fill(self,false);
        for(int i=1;i<self.length;i++){
            String str=""+i;
            int sum=i;
            for(char c:str.toCharArray()){
                sum+=(c-'0');
            }
            if(sum<10001){self[sum]=true;}
            
        }
        
        for(int i=1;i<self.length;i++){
            if(!self[i]){sb.append(i).append("\n");}
        }
        System.out.println(sb);
    }
}