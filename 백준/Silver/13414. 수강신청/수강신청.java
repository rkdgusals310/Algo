import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Set<String> student=new LinkedHashSet<>();
        
        int n=s.nextInt();
        int m=s.nextInt();s.nextLine();
        
        for(int i=0;i<m;i++){
            int size=student.size();
            String str=s.next();
            student.add(str);
            if(size==student.size()){student.remove(str);student.add(str);}
        }
        
        Iterator<String> it=student.iterator();
        int min=student.size()>n?n:student.size();
        while(min>0){
            System.out.println(it.next());
            min--;
        }
    }
}