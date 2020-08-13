package InheritanceAssign;

public class Person {

	String name;
	Person(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString() {
		return "person[" + name+ "]";
		
	}
}
