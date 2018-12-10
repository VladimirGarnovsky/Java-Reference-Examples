
public class Main {

	public static void main(String[] args) throws WierdException {
		MyInter fun;
		
		fun = (n) -> {
						if(n==777)
							try {
								throw new WierdException();
							} catch (WierdException e) {
								
								e.printStackTrace();
								return -1;
							}
						else
							return n+1;
					 };
		System.out.println(fun.func(1));			 

	}

}
