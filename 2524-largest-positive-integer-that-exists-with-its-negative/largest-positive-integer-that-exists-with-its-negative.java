class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            int s = 0, e = nums.length - 1;
            int num = nums[i];
            int tar = -num;

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (nums[mid] == tar) {
                    max = Math.max(max, tar);
                    break;
                } else if (nums[mid] > tar) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            }
        }

        return max;
    }
}