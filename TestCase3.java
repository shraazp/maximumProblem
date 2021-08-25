package genrics;
//when z is maximum
public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for string values
		String xStr="orange",yStr="apple",zStr="pear";
		new MaximumTest(xStr,yStr,zStr).maximum();
		//for float values
		float xfloat=80.6f,yfloat=50.6f,zfloat=756.9f;
		new MaximumTest(xfloat,yfloat,zfloat).maximum();
		//for int values
		int xInt=80,yInt=50,zInt=756;
		new MaximumTest(xInt,yInt,zInt).maximum();
	}

}
