class Solution {
    public int maxDiff(int num) {
        char[] maxChars = String.valueOf(num).toCharArray();
        char[] minChars = String.valueOf(num).toCharArray();
        int n = maxChars.length;

        // Create max
        for (int i = 0; i < n; i++) {
            if (maxChars[i] != '9') {
                char target = maxChars[i];
                for (int j = 0; j < n; j++) {
                    if (maxChars[j] == target)
                        maxChars[j] = '9';
                }
                break;
            }
        }

        // Create min
        if (minChars[0] != '1') {
            char target = minChars[0];
            for (int j = 0; j < n; j++) {
                if (minChars[j] == target)
                    minChars[j] = '1';
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (minChars[i] > '1') {
                    char target = minChars[i];
                    for (int j = i; j < n; j++) {
                        if (minChars[j] == target)
                            minChars[j] = '0';
                    }
                    break;
                }
            }
        }

        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));
        return maxVal - minVal;
    }
}
