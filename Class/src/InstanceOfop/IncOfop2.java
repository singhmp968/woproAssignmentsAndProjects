package InstanceOfop;

public class IncOfop2 {
	class InstanceOfImpl{
	        A a= new A( );
	        B b= new B( );
	        C c= new C( );
	        A ob=c;
	        if (ob instanceof B) 
	        System.out.println("ob now refers to B");else
	        System.out.println("Ob is not instance of B");
	        if (ob instanceof A) System.out.println("ob is also instance of A");else
	        System.out.println("Ob is not instance of A");
	        if (ob instanceof C) System.out.println("ob now refers to C"); else
	        System.out.println("Ob is not instance of C");}}
}
