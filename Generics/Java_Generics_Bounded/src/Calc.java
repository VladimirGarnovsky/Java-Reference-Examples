
public class Calc<T extends Number> {
	private T[] nums;
	
	public Calc(T[] nums){
		this.nums=nums;
	}
	public double calcAvg() {
		double avg=0.0;
		for(int i=0;i<nums.length;i++)
		{
			avg+=nums[i].doubleValue();
		}
		avg/=nums.length;
		return avg;
	}

}
