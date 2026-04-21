class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        boolean x12=x1||x2?true:false;
        boolean x34=x3||x4?true:false;
        boolean answer = x12&&x34?true:false;
        return answer;
    }
}