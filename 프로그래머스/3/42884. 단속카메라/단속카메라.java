/*
고속도로 이용 모든 차량이 단속용 카메라를 한번은 만나도록 카메라 설치하려고함
차량의 경로 routes
최소 몇대의 카메라가 설치되어야하는지 return,


*/

import java.util.*;
class Solution {
public int solution(int[][] routes) {
    List<Integer> list=new ArrayList<>();
    Arrays.sort(routes, (o1, o2) -> {
    if (o1[1] == o2[1]) {
        return Integer.compare(o1[0], o2[0]);
    }
    return Integer.compare(o1[1], o2[1]);
    });
    
    int answer = 0;

    list.add(routes[0][1]);
    
    for(int i=0;i<routes.length;i++){
        int size=list.size();
        if(list.get(size-1)<routes[i][0]){
            list.add(routes[i][1]);
        }
    }


    return answer=list.size();
}
}