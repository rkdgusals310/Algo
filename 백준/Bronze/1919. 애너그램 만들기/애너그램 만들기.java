import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String str=s.next();
        String str2=s.next();
        
        int totalLen=0;
        int alphabet[]=new int[26];
        int alphabet2[]=new int[26];
        
        for(char c:str.toCharArray()){
            alphabet[c-'a']++;
        }
        for(char c:str2.toCharArray()){
            alphabet2[c-'a']++;
        }
        for(int i=0;i<26;i++){
                totalLen+=alphabet[i]-alphabet2[i]>0?alphabet[i]-alphabet2[i]:alphabet2[i]-alphabet[i];

        }
        System.out.print(totalLen);
    }
}