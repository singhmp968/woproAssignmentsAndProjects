
package InheritanceAssign;

class Animal
{
	void eat(){
		System.out.println("eat");
	}
	void sleep()
	{
		System.out.println("sleep");
			
	}
	
	
}



class Bird extends Animal{

	
	void fly()
	{
		System.out.println("yes");
		
	}
}
public class InheriAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal obj1=new Animal();
obj1.eat();
obj1.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
	}

}
