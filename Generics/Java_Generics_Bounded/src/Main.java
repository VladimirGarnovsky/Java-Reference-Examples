
public class Main {

	public static void main(String[] args) {
		Integer arri[] = {1,2,3,4,5,6,7};
		Calc<Integer> i1 = new Calc<Integer>(arri);

		Double arrd[] = {1.0, 0.2,3.0,4.0,5.0,6.0,7.0};
		Calc<Double> d1 = new Calc<Double>(arrd);
		
		System.out.println(i1.calcAvg());
		System.out.println(d1.calcAvg());
	}

}
