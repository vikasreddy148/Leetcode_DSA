class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        long sum=0;
        double maxAverage = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum>maxAverage) maxAverage = sum;
        int s =1,e=k;
        while(e<n){
            sum = sum - nums[s-1]+nums[e];
            if(sum>maxAverage) maxAverage = sum;
            e++;
            s++;
        }
        return maxAverage/k;
    }
}