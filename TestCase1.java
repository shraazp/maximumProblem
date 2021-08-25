package genrics;
import java.util.*;  //for scanner class
public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many parameters do you want(3 or 4)");
		Scanner sc=new Scanner(System.in); //to get how many parameters
		int n=sc.nextInt();
		if(n==3) //when you want 3 parameters
		{
			String xStr="pear",yStr="apple",zStr="orange";
			new MaximumTest(xStr,yStr,zStr).maximum(xStr,yStr,zStr);
			float xfloat=800.6f,yfloat=50.6f,zfloat=756.9f;
			new MaximumTest(xfloat,yfloat,zfloat).maximum(xfloat,yfloat,zfloat);
			int xInt=800,yInt=50,zInt=756;
			new MaximumTest(xInt,yInt,zInt).maximum(xInt,yInt,zInt);
		}
		else // when you want 4 parameters
		{
			String xStr="pear",yStr="apple",zStr="orange",wstr="pineapple";
			new MaximumTest(xStr,yStr,zStr,wstr).maximum(xStr,yStr,zStr,wstr);
			float xfloat=800.6f,yfloat=50.6f,zfloat=756.9f,wfloat=90.08f;
			new MaximumTest(xfloat,yfloat,zfloat,wfloat).maximum(xfloat,yfloat,zfloat,wfloat);
			int xInt=800,yInt=50,zInt=756,wint=989;
			new MaximumTest(xInt,yInt,zInt,wint).maximum(xInt,yInt,zInt,wint);
		}
		
	}

}
