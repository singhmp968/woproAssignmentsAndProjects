package inheri;
class A {

	int m,n;
	void display() {
		System.out.println(m);
	}
}
	class B extends A{
		
		int c;
		void display2()
		{
			System.out.println(c);
		}
		void sum()
		{
			System.out.println(m+n+c);
		}
	}

public class InheritDemo {
				
	public static void main(String args[])
	{
		A s1 =new A();
		B s2=new B();
		s1.m=10;
		s1.n=20;
		System.out.println("State of object A:");
		s1.display();
		s2.m=7;s2.n=8;s2.c=9;
		System.out.println("b");
		s2.display();
		s2.display2();
		System.out.println("Sum of m,n, and c in obj");
		s2.sum();
		
	}
}
