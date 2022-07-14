
public class s08ternaryoperator {

	public static void main(String[] args) {
		int age = 19;
		boolean hasLiense = false;
		boolean canDrive = (age>18) ? true : false; // ternary operator
		boolean canRentACar = canDrive ? (hasLiense ? true:false):false;
		System.out.println("Age = "+ age);
		System.out.println("Has Liense = "+ hasLiense);
		System.out.println("can drive ? "+ canDrive);
		System.out.println("can Rent a car ? "+ canRentACar);
		
		//condition ? true value : false value
		
		System.out.println("");
		String result = canDrive ? (hasLiense ? "Has license can drive" :"No license cant't drive") : "cannot drive";
		System.out.println(result);
		
		

	}

}
