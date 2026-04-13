import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int cnt[]=new int[26];
        
        
        String str=s.next();
        
        for(char c:str.toCharArray()){
            cnt[c-'a']++;
        }
        
        for(int i=0;i<26;i++){
            sb.append(cnt[i]).append(" ");
        }
        System.out.print(sb);
    }
}