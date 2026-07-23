class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int counter = 0;
        int middleElement = nums[nums.length/2];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == middleElement){
                counter++;
            }
            if(counter > 1 ){
                return false;
            }
        }
        return true;
        
    }
}