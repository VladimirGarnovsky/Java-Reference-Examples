
public class Main {

	static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
		return f.someFunc(vals, v);
		}
		public static void main(String args[])
		{
			Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
			String[] strs = { "One", "Two", "Three", "Two" };
			int count;
			count = myOp(MyWorkClass::<Integer>countStuff, vals, 4);
			System.out.println("vals contains " + count + " 4s");
			count = myOp(MyWorkClass::<String>countStuff, strs, "Two");
			System.out.println("strs contains " + count + " Twos");
		}

}
