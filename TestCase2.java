package genrics;
//when y is maximum
public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for string values
		String xStr="apple",yStr="pear",zStr="orange";
		new MaximumTest(xStr,yStr,zStr).maximum();
		
		//for float values
		float xfloat=80.6f,yfloat=500.6f,zfloat=75.9f;
		new MaximumTest(xfloat,yfloat,zfloat).maximum();
		//for int values
		int xInt=8,yInt=50,zInt=7;
		new MaximumTest(xInt,yInt,zInt).maximum();
	}

}
