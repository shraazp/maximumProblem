package genrics;
//UseCase 1 given 3 integers ew have to find the maximum

public class MaximumTest<Float extends Comparable<Float>> {
	
	//parameterized construtor
	Float x,y,z;  //class variables
	
	//parameterized construuctors
	public MaximumTest(Float x,Float y,Float z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	//to get the maximum value
	 public Float maximum()
	 {
		 return MaximumTest.maximum(x, y, z);
	 }
	//compare to function
	 public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
			T max=x;     //will assume x is maximum then compare with y and z
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
	public static <Float> void printMax(Float x,Float y,Float z,Float max)
	{
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}
	
	
}