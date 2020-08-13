package exapmple;

class A {int a,b;
A(int m, int n){
	a = m;b = n;}
void display(){
	System.out.println("a and b are :" + a +" " + b);}}


class B extends A{int c;
B(int m, int n, int o){
	super(m,n);c = o;}
void display() {
	super.display();//a.method overriding is done gere
	System.out.println("c :" + c);}
}
public class OverrideDemo {
	public static void main(String args[])
	{B subOb= new B(4,5,6);subOb.display(); }
}

//class A1{
//	
//}class A2 extends A1{}
//class A3{
//	public static void main(String[]args){
//A1 x;
//	A2 z=new A2();
//	x=newA2();//valid
//	z=newA1();//inva
//	}
//}