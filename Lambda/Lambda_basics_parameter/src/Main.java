
public class Main {

	public static void main(String[] args) {
		MyNumber myNum;
		
		final int NUM=10;
		myNum = (n) -> n/2; // divider
		
		System.out.println(myNum.getNumber(NUM));
		
		myNum = (n) -> n*2; // multiplier
		
		System.out.println(myNum.getNumber(NUM));

	}

}
