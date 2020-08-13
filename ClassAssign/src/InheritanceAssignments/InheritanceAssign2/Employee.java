package InheritanceAssign;

public class Employee extends Person {
	private double salary;
	private int  yearOfJoin;
	private int NationIncNo;
	Employee(String name,double salary,int yearOfJoin,int NationIncNo) {
		super(name);
		this.salary = salary;
		this.yearOfJoin=yearOfJoin;
		this.NationIncNo=NationIncNo;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public double getSalary() {
		return salary;
	}
public int getyearOfJoin() {
		return yearOfJoin;
	}
	public int NationIncNo() {
		return NationIncNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "( name-" + name+" ,Salary-" + salary + ", yearOfJoining-" + yearOfJoin + ", nationalInsuranceNo-"
				+ NationIncNo + ")" ;	}
}
