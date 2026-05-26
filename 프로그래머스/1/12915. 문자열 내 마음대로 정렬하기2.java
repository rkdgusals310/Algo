import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[][] temp=new String[strings.length][2];
        Arrays.sort(strings);
        
        for(int i=0;i<strings.length;i++){
            temp[i][0]=""+strings[i].charAt(n);
            temp[i][1]=""+i;
        }
        Arrays.sort(temp,(a,b)->{
            if(a[0].equals(b[0]))return Integer.compare(Integer.parseInt(a[1]),Integer.parseInt(b[1]));
            return a[0].compareTo(b[0]);
        });
        for(int i=0;i<temp.length;i++){
            answer[i]=strings[Integer.parseInt(temp[i][1])];
        }
        
        return answer;
    }
}
