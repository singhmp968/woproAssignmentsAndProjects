import java.lang.Math; 
class Calculator{
	static int c=0;
	static double d=1;
	static int powerInt(int num1,int num2)
	{
		c=(int) Math.pow(num1, num2);
	return c;
	}
	static double powerDouble(double num1,double num2)
	{
		d=(double) Math.pow(num1,num2);
		return d;
	}

}

public class ClassAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj1 = new Calculator();
System.out.println(obj1.powerInt(2, 3));

System.out.println(obj1.powerDouble(2, 3));

	}

}
