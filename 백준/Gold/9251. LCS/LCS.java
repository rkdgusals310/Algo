import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String str1=s.next();
        String str2=s.next();
        int ch[][] =new int[str1.length()+1][str2.length()+1];
        
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
               if(str1.charAt(i-1)==str2.charAt(j-1)){
                   ch[i][j]=ch[i-1][j-1]+1;
               }
                else{
                    ch[i][j]=Math.max(ch[i-1][j],ch[i][j-1]);
                }
            }
        }
        System.out.print(ch[str1.length()][str2.length()]);
    }
}