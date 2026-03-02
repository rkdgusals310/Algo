import java.util.*;

/*
    일단 그룹 단어란 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말함
   

*/


public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int group[]=new int[26];        
        int n=s.nextInt();
        int answer=0;
        for(int i=0;i<n;i++){
            String str=s.next();
            int cnt=0;
            Arrays.fill(group,0);
            char previous=str.charAt(0);
            group[previous-'a']=1;
            
            for(char c:str.toCharArray()){
                if(previous!=c){
                    if(group[c-'a']==0){
                        group[c-'a']++;
                    }
                    else{
                       cnt++;
                       break; 
                    }
                    previous=c;
                }

            }
            if(cnt==0){answer++;}
        }
        System.out.print(answer);
    }
}