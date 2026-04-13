import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int arr[]=new int[n+1];
        
        
        for(int i=1;i<n+1;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[1]);
        for(int i=2;i<=n;i++){
            if(arr[i]>list.get(list.size()-1)){
                list.add(arr[i]);
            }
            else{
                int r=list.size()-1;
                int l=0;
                int pos=-1;
                while(l<=r){
                    int m=(r+l)/2;
                    if(list.get(m)>=arr[i]){
                        pos=m;
                        r=m-1;
                    }
                    else{
                        l=m+1;
                    }
                    
                }
                list.set(pos,arr[i]);
            }
        }
        System.out.println(list.size());
    }
}