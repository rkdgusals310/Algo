// 피크 요소란 자신을 둘러싼 인접한 요소들보다 모두 큰값인 요소
// 상태 - 비교해야하는 숫자? 이게 계속 바뀌는것같은데 그러니까 peak element가 계속 변하겠지

// 행위 - 할수있는 행동은 비교 인접 그러니까 이전과 이후를 비교
// 종료 - 배열의 끝까지 모두 비교하면 종료
class Solution {
    public int findPeakElement(int[] nums) {
        int peakNum=Integer.MIN_VALUE;
        int peakIndex=-1;
        boolean pass=false;
        for(int i=0;i<nums.length;i++){
            pass=false;
            if(i==0){
                if(nums.length==1){
                    return 0;
                }
                pass=nums[i]>nums[i+1]?true:false;
            }
            else if(i==(nums.length-1)){
                pass=nums[i]>nums[i-1]?true:false;
            }
            else{
                if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])pass=true;
            }

            if(pass){
                if(peakNum<nums[i]){
                    peakIndex=i;
                    peakNum=nums[i];
                }
            }
        }
        return peakIndex;
    }
}