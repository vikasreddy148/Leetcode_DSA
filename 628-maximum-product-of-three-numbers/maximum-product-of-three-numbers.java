class Solution {
    public int maximumProduct(int[] arr) {
        int n = arr.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return Math.max((arr[0] * arr[1] * arr[n - 1]), (arr[n - 2] * arr[n - 1] * arr[n - 3]));
    }
}