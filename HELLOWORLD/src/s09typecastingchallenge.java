
public class s09typecastingchallenge {

	public static void main(String[] args) {
		String input = "68";
		//convert the string input appropriate primitive type
		// byte mybyte = Byte.parseByte(input);
		// System.out.println("Byte val ="+ mybyte);
		
		// int myint = Integer.parseInt(input);
		// System.out.println("integer val ="+ mybyte);
		
		double d = Double.parseDouble(input);
		System.out.println("double val ="+ d);
		
		char input2 = (char)Integer.parseInt(input); 
		System.out.println("char val ="+ input2);
		

	}

}
