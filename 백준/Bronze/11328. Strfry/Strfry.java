import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int alphabet1[]=new int[26];
        int alphabet2[]=new int[26];
        int test=s.nextInt();
        
        for(int t=0;t<test;t++){
            String text=s.next();
            String revised=s.next();
            String reader="Possible";
            Arrays.fill(alphabet1,0);
            Arrays.fill(alphabet2,0);
            
            for(char c:text.toCharArray()){
                alphabet1[c-'a']++;
            }
            for(char c:revised.toCharArray()){
                alphabet2[c-'a']++;
            }
            for(int i=0;i<26;i++){
                if(alphabet1[i]!=alphabet2[i]){
                    reader="Impossible";
                    break;
                }
            }
            sb.append(reader).append("\n");
        }
        System.out.print(sb);
    }
}