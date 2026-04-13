import java.util.*;

public class Main{
    public static boolean visited[];
    public static char password[];
    public static char alpha[];
    public static int vowels=0;
    public static int consonants=0;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int l=s.nextInt();
        int c=s.nextInt();
        password=new char[l];
        alpha=new char[c];
        visited=new boolean[c];
       
        
        
        for(int i=0;i<c;i++){
            alpha[i]=s.next().charAt(0);
        }Arrays.sort(alpha);

        dfs(0,0);
        
    }
    public static void dfs(int index,int depth){
        
        if(depth==password.length){
            StringBuffer sb=new StringBuffer();
            
                Arrays.sort(password);
                for(int i=0;i<password.length;i++){
                    sb.append(password[i]);
                     switch(password[i]){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                vowels++;
                                break;
                            default:
                                consonants++;
                                break;
                        
                    }
                }
                if(vowels>=1&&consonants>=2){
                    
                    System.out.println(sb);
                }
            
            vowels=0;
            consonants=0;
            return;
        }
        
        for(int i=index;i<alpha.length;i++){
            if(!visited[i]){
                visited[i]=true;
                password[depth]=alpha[i];
               
                dfs(i+1,depth+1);
                visited[i]=false;
            }
        }
    }
}