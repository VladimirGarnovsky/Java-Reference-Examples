
public class Main {
	
	public static String stringOp(StringFunc fi,String str) {
		return fi.func(str);
	}
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		// Create a MyStringOps object.
		MyStringOps strOps = new MyStringOps( );
		// Now, a method reference to the instance method strReverse
		// is passed to stringOp().
		outStr = stringOp(strOps::strReverse, inStr);
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);

	}

}
