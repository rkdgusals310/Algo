class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean temp=true;
        String q=ineq+eq;
        switch(q){
            case ">=":
                temp=n>=m;
                break;
            case "<=":
                temp=n<=m;
                break;
            case ">!":
                temp=n>m;
                break;
            case "<!":
                temp=n<m;
                break;
        }
        return answer=temp?1:0;
    }
}