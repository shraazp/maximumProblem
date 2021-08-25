package genrics;
//UseCase 3 given 3 String values we have to find the maximum

public class MaximumTest<String extends Comparable<String>> {
	
	//parameterized construtor
	String x,y,z;  //class variables
	
	//parameterized construuctors
	public MaximumTest(String x,String y,String z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	//to get the maximum value
	 public String maximum()
	 {
		 return MaximumTest.maximum(x, y, z);
	 }
	//compare to function
	public static <String extends Comparable<String>> String maximum(String x,String y,String z) {
		String max=x;     //will assume x is maximum then compare with y and z
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
	public static <String> void printMax(String x,String y,String z,String max)
	{
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}
	
	
}