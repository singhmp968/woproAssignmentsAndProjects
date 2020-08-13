package InstanceOfop;

class A { int i, j;}
class B extends A {int a, b;}
class C extends A {int m, n;}


public class instanceOfOp {
	public static void main(String args[ ]) { 
        A a= new A( );B b= new B( );
        C c= new C( );A ob=b;
        if (ob instanceof B) System.out.println("ob now refers to B");else
        System.out.println("Ob is not instance of B");
        if (ob instanceof A) 
        System.out.println("ob is also instance of A");else
        System.out.println("Ob is not instance of A");
        if (ob instanceof C) 
        System.out.println("ob now refers to C"); else
        System.out.println("Ob is not instance of C");}
    

    
}


