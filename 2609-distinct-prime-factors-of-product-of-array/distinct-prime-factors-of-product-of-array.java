class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int sqrt = (int)Math.sqrt(nums[i]);
            for(int j=2;j<=sqrt;j++){
                if(nums[i]%j==0){
                    set.add(j);
                    while(nums[i]%j == 0){
                        nums[i] = nums[i]/j;
                    }
                }
            }
                if(nums[i]>1){
                    set.add(nums[i]);
                }
        }
        return set.size();
    }
}