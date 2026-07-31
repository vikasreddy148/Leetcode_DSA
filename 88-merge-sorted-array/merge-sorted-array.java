class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = nums1.length;

        int count = 0;

        for (int i = n1 - 1; i >= m; i--) {

            nums1[i] = nums2[count];
            count++;
            n--;

        }

        Arrays.sort(nums1);

    }
}