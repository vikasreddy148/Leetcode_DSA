class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int pSum[] = new int[n];
        pSum[0]=nums[0];
        for(int i=1;i<n;i++){
            pSum[i]=pSum[i-1]+nums[i];
        }
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(!map.containsKey(pSum[i])){
                map.put(pSum[i],i);
            }else{
                ans = Math.max(ans,i-map.get(pSum[i]));
            }
        }
        return ans;
    }
}