import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        List<Class> classMember=new ArrayList<>();
        for(int i=0;i<n;i++){
            String name=s.next();
            int kor=s.nextInt();
            int eng=s.nextInt();
            int math=s.nextInt();
            classMember.add(new Class(name,kor,eng,math));
        }
        Collections.sort(classMember,(a,b)->{
            if(a.getKor()!=b.getKor())return b.getKor()-a.getKor();
            else if(a.getEng()!=b.getEng()) return a.getEng()-b.getEng();
            else if(a.getMath()!=b.getMath()) return b.getMath()-a.getMath();
            return a.getName().compareTo(b.getName());
        });
        for(int i=0;i<n;i++){
            System.out.println(classMember.get(i).getName());
        }
        
        
    }
}

class Class{
    String name;
    int kor;
    int eng;
    int math;
    
    public Class(String name,int kor,int eng,int math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    
    // getter
    public String getName(){
        return name;
    }
    public int getKor(){
        return kor;
    }
    public int getEng(){
        return eng;
    }
    public int getMath(){
        return math;
    }
    
    // setter
    public void setName(){
        this.name=name;
    }
    public void setKor(){
        this.kor=kor;
    }
    public void setEng(){
        this.eng=eng;
    }
    public void setMath(){
        this.math=math;
    }
}