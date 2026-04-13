import java.util.Scanner;

public class Main{
    static int cnt;
    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();scan.nextLine();
        
        for(int i=0;i<n;i++){
            cnt=0;
            String str=scan.next();
            int pal=isPalindrome(str);
            System.out.println(pal+" "+cnt);
        }
                    
    }
}