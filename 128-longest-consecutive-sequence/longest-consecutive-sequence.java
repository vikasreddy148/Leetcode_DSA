class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans = 0;
        for(int num : set){
            int len = 0;
            if(!set.contains(num-1)){
                int s = num;
                while(set.contains(s)){
                    len++;
                    s++;
                }
            ans = Math.max(ans,len);
            }
        }
        return ans;
    }
}