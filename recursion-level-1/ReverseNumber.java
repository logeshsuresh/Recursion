public class ReverseNumber {
    static int reversedNumber = 0;
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        reversedNumber = (reversedNumber * 10) + digit;
        reverse(n / 10);
    }
}
