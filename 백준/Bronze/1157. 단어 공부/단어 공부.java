import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n[]=new int[(int)('z'-'a')+1];
        String str=s.next();
        int index=0;
        // 97 -65 =32
        for(char c:str.toCharArray()){
            
            index=(int)(c-'A');
            if(c>='a'&&c<='z'){
                index-=(int)('a'-'A');
            }
            
            n[index]++;
        }
        int max=n[0];
        int ind=0;
        int cnt=1;
        for(int i=1;i<n.length;i++){
            if(max<=n[i]){
                if(max==n[i]){
                    cnt++;
                }
                else{
                    cnt=1;
                    ind=i;
                    max=n[i];
                }
            }
        }
        char ch='?';
        if(cnt==1){ch=(char)('A'+ind);}
        System.out.print(ch);
    }
}