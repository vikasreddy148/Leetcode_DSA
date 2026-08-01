class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();

        int z = 0;
        int o = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                o++;
            } else {
                z++;
            }

            if (Math.abs(o - z) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}