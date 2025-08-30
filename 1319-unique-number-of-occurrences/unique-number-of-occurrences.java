class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int e : arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int key : map.keySet()){
                set.add(map.get(key));
        }
        return map.size()==set.size();
    }
}