
public class Gen<T> {
	String className;
	T ob; // for getting the type
	
	Gen(T ob){		
		this.ob = ob;
		className = "Gen "+ob.getClass();
	}
	public void showInfo() {
		System.out.println("This object is of class:"+className);
	}
	public String getName() {
		return className;
	}
	public boolean compareNames(Gen<?> ob) {
		
		if(this.getName().equals(ob.getName()))
			return true;
		return false;
		
	}
}
