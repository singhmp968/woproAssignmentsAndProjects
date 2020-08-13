package InheritanceAssign3;

public class Teacher extends Person {

	String sub;
	double sal;
	Teacher(String name,String sub,double sal)
	{
		this.name = name;
		this.sub=sub;
		this.sal=sal;
	}
	
	void Disp() {
		System.out.println("Name: " + name + ", Subject: " + sub + ", Salary: " + sal);
	}
}
