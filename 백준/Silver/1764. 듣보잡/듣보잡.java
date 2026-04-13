import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import java.util.List;


public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int num=0;
        Set<String> set=new HashSet<>();
        List<String> answer=new ArrayList<>();
        int size=0;
        for(int i=0;i<n+m;i++){
            String str=s.next();
            if(i>n-1){
                set.add(str);
                if(set.size()==size){
                    num++;
                    answer.add(str);
                }
                else{
                   set.remove(str);
                }
            }else{
                set.add(str);
                size=set.size();
            }
        }
        System.out.println(num);
        Collections.sort(answer);
        Iterator<String> it=answer.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
       
    }
}