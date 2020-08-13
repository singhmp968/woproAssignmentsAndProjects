class Patient {
String patientName;
static double height;
static double width;
Patient(String patientName,double height, double width)
{
	this.patientName = patientName;
	this.height=height;
	this.width=width;
}

static double computeBMI()
{
	return (width/(height*height));
}

}


public class ClassAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patient obj = new Patient("Rahul",1.6,56);
System.out.print(obj.computeBMI());


	}

}
