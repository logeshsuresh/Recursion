
public class NToOne {
	public static void printNToOne(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printNToOne(n-1);
	}
}
