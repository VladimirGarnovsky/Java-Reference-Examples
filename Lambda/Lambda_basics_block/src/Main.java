
public class Main {

	public static void main(String[] args) {
		
		Func func;
		
		func = (n)-> {
						int sum=0;
						if(n>0)
						{
							for(int i=0;i<n;i++)
							  sum+=i;
							return sum;
						}
						else
							return -1;
				    };
		System.out.println(func.getNum(10));	
		
		System.out.println(func.getNum(-10));	

	}

}
