class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] pSum = new int[n];
        pSum[0]=nums[0];
        for(int i=1;i<n;i++){
            pSum[i]=pSum[i-1]+nums[i];
        }
        return pSum;
    }
}