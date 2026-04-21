import java.util.*;
class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int start=0;
        int end=num_list.length-1;
        int gap=1;
        switch(n){
                case 1:
                    end=slicer[1];
                    break;
                case 2:
                    start=slicer[0];
                    break;
                case 3:
                    start=slicer[0];
                    end=slicer[1];
                    break;
                case 4:
                    start=slicer[0];
                    end=slicer[1];
                    gap=slicer[2];
                    break;
        }
        for(int i=start;i<=end;i+=gap){
            answer.add(num_list[i]);
        }
        return answer;
    }
}