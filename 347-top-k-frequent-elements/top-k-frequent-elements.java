class Pair {
    int val;
    int freq;

    Pair(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }
}

class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        return p2.freq - p1.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        for (int key : map.keySet()) {
            pq.add(new Pair(key, map.get(key)));
        }

        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().val;
        }

        return ans;

    }
}