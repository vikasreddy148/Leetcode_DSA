class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n < 0) {
            double t = (myPow(x, -(n / 2)));
            if (n % 2 == 0) {
                return 1 / t * 1 / t;
            } else {
                return 1 / t * 1 / t * 1 / x;
            }

        } else {
            double t1 = myPow(x, n / 2);
            if (n % 2 == 0) {

                return t1 * t1;
            } else {
                return t1 * t1 * x;
            }
        }

    }
}