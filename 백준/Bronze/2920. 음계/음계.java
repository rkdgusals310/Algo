import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str="";
        for(int i=0;i<8;i++){
            int n=s.nextInt();
            switch(n){
                case 1:
                    str+="c";
                    break;
                case 2:
                    str+="d";
                    break;
                case 3:
                    str+="e";
                    break;
                case 4:
                    str+="f";
                    break;
                case 5:
                    str+="g";
                    break;
                case 6:str+="a";
                    break;
                case 7:
                    str+="b";
                    break;
                case 8:
                    str+="C";
                    break;
            }
        }
        
        String returnStr="";
        if(str.equals("cdefgabC")){returnStr="ascending";}
        else if(str.equals("Cbagfedc")){returnStr="descending";}
        else{returnStr="mixed";}
 
        System.out.print(returnStr);
    }
}