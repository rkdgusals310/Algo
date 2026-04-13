import java.util.*;
public class Main{
    public static void main(String arsg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();s.nextLine();
        
        Map<String,Integer> map1=new HashMap<>();
        Map<Integer,String> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            String str=s.next();
            map1.put(str,i+1);
            map2.put(i+1,str);
        }
        for(int i=0;i<m;i++){
            String str=s.next();
            if(map1.containsKey(str)){System.out.println(map1.get(str));}
            else{System.out.println(map2.get(Integer.parseInt(str)));}
        }
    }
}