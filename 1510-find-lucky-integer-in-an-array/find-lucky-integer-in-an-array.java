class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        int max = -1;
        for (Integer key : map.keySet()) {
            if (key.equals(map.get(key))) {
                max = Math.max(max, key);
            }
        }
        return max;
        
    }
}