// Demonstrate Gen use, getting the T type
// Using the wildcard <?> to compare between objects
public class Main {

	public static void main(String[] args) {
		Gen<Integer> ob1 = new Gen<>(1);
		Gen<Double> ob2 = new Gen<>(1.1);
		Gen<Double> ob3 = new Gen<>(4.5);
		Gen<Integer> ob4 = new Gen<>(30);
		
		ob1.showInfo();
		ob2.showInfo();
		ob3.showInfo();
		ob4.showInfo();
		
		System.out.println(ob1.compareNames(ob4));
		System.out.println(ob1.compareNames(ob2));
		
	}

}
