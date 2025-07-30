class Solution {
    public int[][] generateMatrix(int n) {
        int spiral[][] = new int[n][n];
        int i = 0, j = 0;
        int k = 1;
        while (n > 1) {
            for (int l = 1; l < n; l++) {
                spiral[i][j] = k;
                k++;
                j++;
            }
            for (int l = 1; l < n; l++) {
                spiral[i][j] = k;
                k++;
                i++;
            }
            for (int l = 1; l < n; l++) {
                spiral[i][j] = k;
                k++;
                j--;
            }
            for (int l = 1; l < n; l++) {
                spiral[i][j] = k;
                k++;
                i--;
            }
            i++;
            j++;
            n = n - 2;
        }
        if (n == 1) {
            spiral[i][j] = k;
        }
        return spiral;

    }
}