class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = bulbs.size();

        for (int i = 0; i < n; i++) {
            int e = bulbs.get(i);
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (int e : map.keySet()) {
            if (map.get(e) % 2 != 0) {
                ans.add(e);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}