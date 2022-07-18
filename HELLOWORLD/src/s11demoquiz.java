import java.util.Scanner;

public class s11demoquiz {

	public static void main(String[] args) {
		while (true) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("who is the founder of blue origin?");
			System.out.println("1.bill gates\n2.tim cook\n3.nadella\n4. jeff bezos\n5. exit program");
			System.out.println("enter your choice...");
			n = sc.nextInt();
			String str=sc.nextLine();

			if (n == 4) {
				System.out.println("good");
				break;
			} else if (n == 5) {
				break;
			} else {
				System.out.println("wrong");
			}

		}

	}

}
