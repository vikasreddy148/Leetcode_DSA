class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<l1;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<l2;i++){
            int key = nums2[i];
            if(map.containsKey(key)){
                set.add(key);
                
            }
            
        }
        int ans[] = new int[set.size()];
        int i=0; 
        for(int v : set){
            ans[i] = v;
            i++;
        }

        return ans;
    }
}