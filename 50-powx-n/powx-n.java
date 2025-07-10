class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n; // Use long to handle edge case like Integer.MIN_VALUE

        if (num < 0) {
            x = 1 / x;
            num = -num;
        }

        while (num > 0) {
            if (num % 2 == 1) {
                ans *= x;
            }
            x *= x;
            num /= 2;
        }

        return ans;
    }
}
