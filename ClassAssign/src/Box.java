
class box1 {
	private double w,h,d;
	box1(double wi,double hi,double di)
	{
		w=wi;
		h=hi;
		d=di;
	}
	double vol() {
		return w*h*d;
	}
}

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
box1 obj1=new box1(20,20,20);
System.out.print(obj1.vol());

	}

}
