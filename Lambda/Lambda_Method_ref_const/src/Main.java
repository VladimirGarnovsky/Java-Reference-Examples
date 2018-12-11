
public class Main {
	public static void main(String[] args) {
		MyFuncIntr i1 = VClass::new; // connects to the constructor compatible with the interface
		
		VClass c1 = i1.createObj();
		c1.setValue(1000);
		System.out.println(c1.getValue());
	}
}
