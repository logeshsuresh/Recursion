class Solution {
    public double myPow(double x, int n) {
        boolean isNeg = (x < 0) ? true : false;
        boolean nNeg = (n < 0) ? true : false;
        x = Math.abs(x);
        double pow = power(x, n);
        if (nNeg) {
            pow = 1 / pow;
        }   
        if (isNeg && n % 2 != 0) {
            pow = -1 * pow;
        } 
        return pow;
    }

    public static double power(double x, int  n) {
        if (n == 0) {
            return 1;
        }
        double X = power(x, n / 2);
        if (n % 2 == 0) {
            return X * X;
        } else {
            return X * X * x;
        }
    }
}