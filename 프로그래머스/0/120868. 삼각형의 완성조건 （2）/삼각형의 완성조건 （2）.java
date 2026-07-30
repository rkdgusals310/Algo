class Solution {
    public int solution(int[] sides) {
        int min=sides[0]>sides[1]?sides[1]:sides[0];
        
        
        return min+min-1;
    }
}