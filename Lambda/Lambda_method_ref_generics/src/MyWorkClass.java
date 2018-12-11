
public class MyWorkClass {
	static <T> int countStuff(T[] vals, T value) {
		int count=0;
		
		for(int i=0;i<vals.length;i++) {
			if(vals[i] == value)
				count++;
		}
		return count;
	}
}
