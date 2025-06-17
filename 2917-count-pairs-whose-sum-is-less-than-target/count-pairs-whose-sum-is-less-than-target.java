class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }else if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count/2;
        
    }
}