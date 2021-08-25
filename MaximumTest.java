package genrics;

public class MaximumTest<Integer extends Comparable<Integer>> {
	
	Integer x,y,z;
	public MaximumTest(Integer x,Integer y,Integer z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	 public Integer maximum()
	 {
		 return MaximumTest.maximum(x, y, z);
	 }
	
	public static <Integer extends Comparable<Integer>> Integer maximum(Integer x,Integer y,Integer z) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}

	public static <Integer> void printMax(Integer x,Integer y,Integer z,Integer max)
	{
		System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xInt=8,yInt=5,zInt=7;
		new MaximumTest(xInt,yInt,zInt).maximum();
	}

}
