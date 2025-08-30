class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans += key;
            }
        }
        return ans;
    }
}