// 97 26
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        char start='a';
        for(int i=0;i<26;i++){
            int a=start+i;
            int num=a-97; //97-96
            map.put((char)a,num);
        }
        String str=s.next();int cnt=0;
        int arr[]=new int[26];
        Arrays.fill(arr,-1);
        
        for(int i=0;i<str.length();i++){
           int size=set.size(); 
      set.add(str.charAt(i));
            if(size!=set.size()){
            arr[map.get(str.charAt(i))]=i;}
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}