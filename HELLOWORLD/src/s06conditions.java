
public class s06conditions {

	public static void main(String[] args) {
		boolean isAlien = false;
		if(isAlien) {
			System.out.println("it is an alien");
		}
		if (!isAlien) {
			System.out.println("it is not an alien");
		}
		String name = "max";
		if (name == "max") {
			System.out.println("correct name");
		}
		boolean x = true;
		boolean y = false;
		if (x&&y) {
			System.out.println("both are true");
		}
		else if (x) {
			System.out.println("only x true");
		}
		else {
			System.out.println("only y true");
		}
		int a =10;
		int b=5;
		int c=20;
		System.out.println("a<b="+(a<b));
		System.out.println("a<b and a<c ="+ (a<b && a<c)); //logical AND
		System.out.println("a<b and a<c ="+ (a<b & a<c));  // bitwise AND
		System.out.println("a<b and a<c ="+ (a<b && ++a<c));
		System.out.println("A after logical and ="+a);
		System.out.println("a<b and a<c ="+ (a<b & ++a<c));
		System.out.println("A after bitwise and =" + a );
		
		boolean mybool = false;
		if(mybool = false) {
			System.out.println("X");
		}
		else {
			System.out.println("Y");
		}
		System.out.println("what willl be the value?" + (mybool=false));
	}

}
