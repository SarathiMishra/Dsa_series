class Solution {
    public double myPow(double x, int n) {
        long binForm = Math.abs((long) n);   // long handles Integer.MIN_VALUE

        double ans = 1.0;
        double base = x;
        while (binForm > 0) {
            if (binForm % 2 != 0) {
                ans *= base;
            }
            base *= base;
            binForm /= 2;
        }
        return n < 0 ? 1.0 / ans : ans;



        // // If power is negative, convert it into positive
        // // Example: 2^-3 = 1 / 2^3
        // if(n < 0){
        //     n = n * -1; // Convert negative power into positive
        //     x = 1/x; // Take reciprocal of x
        // }
        // // Initially result is 1 because multiplying by 1
        // // does not change any number
        // double result = 1;
        // // Continue until power becomes 0
        // while(n != 0){
        //     // If power is odd, multiply current x with result
        //     if(n % 2 != 0){
        //         result = result * x;
        //     }
        //     // Square x in every iteration
        //     // Example: 2 -> 4 -> 16 -> 256
        //     x = x*x;
        //     // Divide power by 2 (integer division)
        //     n = n/2;
        // }
        // return result;
    }
}