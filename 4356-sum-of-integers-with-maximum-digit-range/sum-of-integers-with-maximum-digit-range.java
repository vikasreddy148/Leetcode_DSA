class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;

        int digRange = -1;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int largest = Arrays.stream(String.valueOf(num).split(""))
                    .mapToInt(Integer::parseInt)
                    .max()
                    .getAsInt();

            int smallest = Arrays.stream(String.valueOf(num).split(""))
                    .mapToInt(Integer::parseInt)
                    .min()
                    .getAsInt();
            digRange = Math.max(digRange, (largest-smallest));
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int largest = Arrays.stream(String.valueOf(num).split(""))
                    .mapToInt(Integer::parseInt)
                    .max()
                    .getAsInt();
            
            int smallest = Arrays.stream(String.valueOf(num).split(""))
                    .mapToInt(Integer::parseInt)
                    .min()
                    .getAsInt();
            if(largest - smallest == digRange){
                ans = ans + num;
            }
        }
        return ans;

    }
}