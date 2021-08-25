package genrics;
//when x is maximum for integer,float and string values
public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xStr="pear",yStr="apple",zStr="orange";
		new MaximumTest(xStr,yStr,zStr).maximum();
		float xfloat=800.6f,yfloat=50.6f,zfloat=756.9f;
		new MaximumTest(xfloat,yfloat,zfloat).maximum();
		int xInt=800,yInt=50,zInt=756;
		new MaximumTest(xInt,yInt,zInt).maximum();
	}

}
