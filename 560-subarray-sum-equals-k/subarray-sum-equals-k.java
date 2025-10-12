class Solution {
    public int subarraySum(int[] nums, int k) {
        long pSum[] = new long[nums.length];
        pSum[0] = nums[0];
        int c = 0;
        HashMap<Long,Integer> map = new HashMap();
        map.put(0l,1);
        for(int i=1;i<nums.length;i++){
            pSum[i] = pSum[i-1]+nums[i];
        }

        for(int j=0;j<nums.length;j++){
            long t = pSum[j] - k;
            if(map.containsKey(t)){
                c = c + map.get(t);
            }
                map.put(pSum[j],map.getOrDefault(pSum[j],0)+1);
            
            
        }
        return c;
    }
}