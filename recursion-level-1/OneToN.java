
public class OneToN {
	public static void printOneToN(int n) {
		if (n == 0) {
			return;
		}
		printOneToN(n-1);
		System.out.println(n);
	}
}
