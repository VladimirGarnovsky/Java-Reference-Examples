
public class Main {

	public static void main(String[] args) {
		MyInter func;
		int num=10;
		func = ()-> {
						int v=5;
						v+=num;
						// num = 1 is illegal
						return v;
					};
		System.out.println(func.func());			
		}
		

	}


