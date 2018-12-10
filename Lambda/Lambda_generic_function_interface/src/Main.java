
public class Main {

	public static void main(String[] args) {
		SomeFunc<String> funcStr; // since this is
		SomeFunc<Integer> funcInt;
		
		funcStr = (str) -> {
								String returnStr="";
								for(int i=0;i<str.length();i++)
								{
									returnStr+=str.charAt(str.length()-1-i);
								}
								return returnStr.toString();
						   };
						   
		funcInt = (n) -> {
								return n*n;
						 };	
		
		System.out.println(funcStr.func("Vova"));
		System.out.println(funcInt.func(20));	
	}

}
