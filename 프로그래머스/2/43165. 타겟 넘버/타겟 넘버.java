class Solution {
    public boolean visited[][];
    public int cnt=0;
    public int sum[];
    public int solution(int[] numbers, int target) {
        int answer = 0;
        visited=new boolean[numbers.length][2]; // - + 
        sum=new int[numbers.length];
        
        dfs(0,0,numbers,target);
        
        return answer=cnt;
    }
    public void dfs(int sum,int depth,int numbers[],int target){
        if(depth==numbers.length){
            if(target==sum)cnt++;
            return;
        }
        dfs(sum-numbers[depth],depth+1,numbers,target);
        dfs(sum+numbers[depth],depth+1,numbers,target);
        
    }

}
//약간 이분탐색?인가? 그거 떠오르는데