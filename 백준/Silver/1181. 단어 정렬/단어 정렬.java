import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        List<Alpha> list=new ArrayList<>();
        Set<Alpha> set=new LinkedHashSet<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String str=s.next();
            list.add(new Alpha(str.length(),str));
        }
        Collections.sort(list,(a,b)->{
           if(a.len!=b.len)return a.len-b.len;
            return a.str.compareTo(b.str);
        });
        
        for(int i=0;i<n;i++){
            set.add(new Alpha(list.get(i).len,list.get(i).str));
            
        }
        Iterator<Alpha> it=set.iterator();
        while(it.hasNext()){
            Alpha alphabet=it.next();
            System.out.println(alphabet.str);
        }
    }
}
class Alpha{
    public int len;
    public String str;
    
    public Alpha(int len,String str){
        this.len=len;
        this.str=str;
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Alpha)) return false;
        Alpha other = (Alpha) obj;
        return len==other.len&&str.equals(other.str);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(len, str);
    }
}
