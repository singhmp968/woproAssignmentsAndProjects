package InheritanceAssign3;

public class CollageName extends Student {

	String collageName;
	int year;
	
	CollageName(String name,int rollNo,String collageName,int year)
	{
		this.collageName=name;
		this.rollNo = rollNo;
		this.collageName=collageName;
		this.year = year;
	}
	void display()
	{
		System.out.println("Name: " + name + ", RollNo: " + rollNo + ", year: " + year + "Collage Name " + collageName);
	}
}
