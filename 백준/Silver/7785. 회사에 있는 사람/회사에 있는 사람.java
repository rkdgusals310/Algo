import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        Map<String,String> employee=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            String str1=s.next();
            String str2=s.next();
            employee.put(str1,str2);
            
        }
        Iterator<String> it=employee.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            if(employee.get(key).equals("enter")){System.out.println(key);}
        }


    }
}