import java.util.Arrays;
class Solution {
    public double solution(int[] arr) {
        // return (double)(Arrays.stream(arr).sum())/arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }return (double) sum/arr.length;
    }
}