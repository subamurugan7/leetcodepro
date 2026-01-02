class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1; // Any number raised to the power 0 is 1
        }
        
        // Handle negative exponent
        if (n < 0) {
            x = 1 / x;
            n = -n;  // Make n positive
        }
        
        // Exponentiation by squaring
        return helper(x, n);
    }

    private double helper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half; // Even power
        } else {
            return half * half * x; // Odd power
        }
    }
}
