
class employee {
	int id;
	String name;
	int salary;
	void setId(int no)
	{
		id=no;
	}
	void setName(String name)
	{
		this.name = name;
		
	}
	void setSalary(int s)
	{
		salary = s;
	}
	void getEDe()
	{
		System.out.print(name + "da" + salary);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp1=new employee();
		emp1.setId(101);
		emp1.setName("yadav");
		emp1.setSalary(12000);
		emp1.getEDe();

	}

}
