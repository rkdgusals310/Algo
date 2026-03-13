import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        String str=s.next();
        int cnt=0;
        for(int i=1;i<str.length();i++){
            String str2=""+str.charAt(i-1)+""+str.charAt(i);
            // System.out.println(i+" "+str2);
             switch(str2){
                case "c=":
                case "c-":
                case "d-":
                case "lj":
                case "nj":
                case "s=":
                case "z=":
                    cnt++;    
                    break;
            
            }
            if(str2.equals("z=")&&i>1){
                if(str.charAt(i-2)=='d')cnt++;
            }
        }
        System.out.println(str.length()-cnt);
       
    }
}