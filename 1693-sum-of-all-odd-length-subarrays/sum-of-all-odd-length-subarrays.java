class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int occ = (i + 1) * (n - i);
            int oddOcc = (occ + 1) / 2;
            sum += arr[i] * oddOcc;
        }

        return sum;
    }
}