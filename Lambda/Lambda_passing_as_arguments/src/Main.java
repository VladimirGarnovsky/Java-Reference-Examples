
public class Main {

	public static void main(String[] args) {
		String str2 = "Vladimir";
		
		FuncInt fi = (str) -> {
								String returnStr="";
								for(int i=0;i<str.length();i++)
								{
									returnStr+=str.charAt(str.length()-1-i);
								}
								return returnStr.toString();		
							  };
		System.out.println(SomeClass.AwesomeFunction(fi, str2))	;				  

	}

}
