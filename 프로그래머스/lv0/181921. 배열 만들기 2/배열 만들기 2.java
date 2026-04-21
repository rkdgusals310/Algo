import java.util.*;
class Solution {
    public List<Integer>  solution(int l, int r) {
        List<Integer> list=new LinkedList<>();
        
        for(int i=l;i<=r;i++){
            String str=""+i;
            int cnt=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)-'0'!=5&&str.charAt(j)-'0'!=0){
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                list.add(i);
            }
        }
        if(list.size()==0)list.add(-1);
        return list;
    }
}