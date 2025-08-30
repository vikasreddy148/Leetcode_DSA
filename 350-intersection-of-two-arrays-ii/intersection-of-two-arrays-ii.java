class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < l1; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < l2; i++) {
            int key = nums2[i];
            if (map.containsKey(key) && map.get(key)>0)  {
                set.add(key);
                map.put(key,map.get(key)-1);
                if(map.get(key)==0){
                    map.remove(key);
                }
            }

        }
        int ans[] = new int[set.size()];
        int i = 0;
        for (int v : set) {
            ans[i] = v;
            i++;
        }

        return ans;
    }
}