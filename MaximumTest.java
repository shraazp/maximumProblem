package genrics;
//UseCase 4 to add more parameters in the maximum function 3 and 4 are used

public class MaximumTest<T extends Comparable<T>> {
	
	//parameterized construtor
	T x,y,z,w;  //class variables
	
	//parameterized construuctors for 3 variables
	public MaximumTest(T x,T y,T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	//parameterized construuctors for 4 variables
	public MaximumTest(T x,T y,T z,T w) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
	}
	
	
	//compare to function for 3 parameters
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
	 	//compare to function for 4 parameters
		 public static <T extends Comparable<T>> T maximum(T x,T y,T z,T w) {
				T max=x;     //will assume x is maximum then compare with y and z
				if(y.compareTo(max)>0) {
					max=y;
				}
				if(z.compareTo(max)>0) {
					max=z;
				}
				if(w.compareTo(max)>0)
				{
					max=w;
				}
				printMax(x,y,z,w,max);
				return max;
			}
	//to print the maximum value for 3 parameters
	public static <T> void printMax(T x,T y,T z,T max)
	{
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}
	//to print the maximum value for 4 parameters
	public static <T> void printMax(T x,T y,T z,T w,T max)
	{
		System.out.printf("Max of %s,%s,%s and %s is %s\n",x,y,z,w,max);
	}
}