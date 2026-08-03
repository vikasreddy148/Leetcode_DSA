class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] s = new int[n];
        int[] p = new int[n];
        int[] ans = new int[n];
        p[0] = nums[0];
        s[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] * nums[i];

        }
        for (int i = n - 2; i >= 0; i--) {
            s[i] = s[i + 1] * nums[i];

        }
        ans[0] = s[1];
        ans[n - 1] = p[n - 2];
        for (int i = 1; i < n - 1; i++) {

            ans[i] = p[i - 1] * s[i + 1];

        }

        return ans;
    }
}