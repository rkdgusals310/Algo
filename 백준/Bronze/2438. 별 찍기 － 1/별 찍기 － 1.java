import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String str="";
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            str+="*";
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}