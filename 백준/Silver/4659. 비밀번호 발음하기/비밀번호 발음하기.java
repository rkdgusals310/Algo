import java.util.*;

public class Main{
    public static String str;
    //public static int seVowel=1;
    //public static int seCons=1;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        while(true){
            int vowel=0;
            int sequence=1;
            int seVowel=0;
            int seCons=1;

            str=s.next();
            if(str.equals("end"))break;
            if(check(str.charAt(0))){
                vowel=1;
                seVowel=1;
                seCons=0;
            }
            
            dfs(1,vowel,sequence,seVowel,seCons);
             
        }
    }
    public static void dfs(int start,int vowel,int sequence,int seVowel,int seCons){
        if(start==str.length()||seVowel>=3||seCons>=3||sequence>=2){
            if(vowel>=1&&sequence<2&&seVowel<3&&seCons<3){
                System.out.println("<"+str+"> is acceptable.");
                //System.out.println("<"+str+">"+" "+sequence+" "+seVowel+" "+seCons);
            }
            else{
                System.out.println("<"+str+"> is not acceptable.");
                //System.out.println("<"+str+">"+" "+sequence+" "+seVowel+" "+seCons);
            }
            return;
        }
        char c=str.charAt(start);
        if(check(c)&&c==str.charAt(start-1)){
            if(c=='e'&&'e'==str.charAt(start-1))dfs(start+1,vowel+1,sequence,seVowel+1,0);
            else if(c=='o'&&'o'==str.charAt(start-1))dfs(start+1,vowel+1,sequence,seVowel+1,0);
            else dfs(start+1,vowel+1,sequence+1,seVowel+1,0);}
        else if(check(c)){dfs(start+1,vowel+1,1,seVowel+1,0);}
        else if(c==str.charAt(start-1)){
            dfs(start+1,vowel,sequence+1,0,seCons+1);
        }
        else{dfs(start+1,vowel,1,0,seCons+1);}
    }

    public static boolean check(char c){
        return c=='a'||c=='i'||c=='e'||c=='o'||c=='u';
    }
}