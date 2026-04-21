import java.util.*;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String americano[]={"iceamericano", "americanoice","hotamericano", "americanohot","anything","americano"};
        String cafelatte[]={"icecafelatte", "cafelatteice","hotcafelatte", "cafelattehot","cafelatte"};
        List<String> list1=new ArrayList<>(Arrays.asList(americano));
        List<String> list2=new ArrayList<>(Arrays.asList(cafelatte));
        
        for(int i=0;i<order.length;i++){
            if(list1.contains(order[i]))answer+=4500;
            else if(list2.contains(order[i]))answer+=5000;
        }
        return answer;
    }
}