public class CountZeros {
    static int zeros = 0;
    public static void countZeros (int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        if (digit == 0) zeros += 1;
        countZeros(n / 10);
    }
}
