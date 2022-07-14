
public class s10loops {

	public static void main(String[] args) {
		System.out.println("Manufacturing toys - 1");
		System.out.println("Manufacturing toys - 2");
		System.out.println("Manufacturing toys - 3");
		System.out.println("Manufacturing toys - 4");

		for (int i = 0; i < 10; i++) {
			System.out.println("Manufacturing toys - " + i);
		}
		for (int j = 10; j > 0; j--) {
			System.out.println("value of j - " + j--);
		}
		for (int k = 1; k <= 10; k += 2) {
			System.out.println("value of k - " + k);
		}
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		// odd number between 22 to 98
		for (int i = 22; i <= 98; ++i) {
			System.out.print(+ ++i);
			System.out.println(" ");
		}
		// find sum of all numbers divided by 3 and 5 between 1 to 100
		int a = 0;
		int c = 0;
		for (int i = 1; i <= 100; ++i) {
			if (i % 3 == 0 && i % 5 == 0) {
				c = c + 1;
				a = a + i;
			}
			if (c==5) {
				break;
			}
		}
		System.out.print(a);

	}

}
