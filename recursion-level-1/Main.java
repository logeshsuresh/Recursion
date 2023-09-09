public class Main {
    public static void main(String[] args) {
        int n = 5;
        NToOne.printNToOne(5);
        System.out.println(" --- ");
        OneToN.printOneToN(5);
        System.out.println(Factorial.factorial(5));
        System.out.println(SumNToOne.sum(5));
        System.out.println(SumDigits.sumOfDigits(1342));
        System.out.println(ProductDigits.productOfDigits(13420));
        ReverseNumber.reverse(1234);
        System.out.println(ReverseNumber.reversedNumber);
        CountZeros.countZeros(20030);
        System.out.println(CountZeros.zeros);
    }
}