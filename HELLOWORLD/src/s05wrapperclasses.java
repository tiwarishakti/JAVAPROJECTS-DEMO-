
public class s05wrapperclasses {

	public static void main(String[] args) {
		int y =1;
		// Auto-Boxing from int to Integer
		Integer x = 2;
		Integer z = new Integer(5);
		// Auto-unboxing from Integer to int
		int myint = z; //converting automatically- auto unboxing
		myint = z.intValue(); //convert explicitly from wrapper to primitive
		short yshort = 3276;
		Short newshort = yshort;

	}

}
