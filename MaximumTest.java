package genrics;
//UseCase 1 given 3 integers ew have to find the maximum

public class MaximumTest<Integer extends Comparable<Integer>> {
	
	//parameterized construtor
	Integer x,y,z;  //class variables
	
	//parameterized construuctors
	public MaximumTest(Integer x,Integer y,Integer z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	//to get the maximum value
	 public Integer maximum()
	 {
		 return MaximumTest.maximum(x, y, z);
	 }
	//compare to function
	public static <Integer extends Comparable<Integer>> Integer maximum(Integer x,Integer y,Integer z) {
		Integer max=x;     //will assume x is maximum then compare with y and z
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
//to print the maximum value
	public static <Integer> void printMax(Integer x,Integer y,Integer z,Integer max)
	{
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}
	
	
}