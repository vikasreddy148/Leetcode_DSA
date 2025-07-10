class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a, b) -> freqMap.get(b) - freqMap.get(a));

        pq.addAll(freqMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int count = freqMap.get(ch);
            result.append(String.valueOf(ch).repeat(count));
        }

        return result.toString();
    }
}