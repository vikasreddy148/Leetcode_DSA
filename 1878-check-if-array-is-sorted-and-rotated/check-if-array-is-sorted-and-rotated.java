class Solution {
    int k = 0;

    boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public boolean check(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k = nums.length - i - 1;
                break;
            }
        }
        k = k % nums.length;

        System.out.println(k);
        if (isSorted(nums)) {
            return true;
        } else {
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
            return isSorted(nums);
        }
        // return false;
    }
}