package inheri;

class A2 {
    A2(){ 
    System.out.println("A1's no arg constructor"); 
    
}
A2(int a){System.out.println("A1's constructor "+ a); }
}
class B2 extends A2{
	B2(){ 
		System.out.println("B1's no arg constructor"); }
B2(int b){
this("x");
System.out.println("B1's constructor "+ b); 
}
B2(String b){ super(1000);
System.out.println("B1's constructor "+ b); }
}
class C2 extends B2{
	C2() {
    System.out.println("C1's no arg constructor"); 
    
}
	C2(int c){ 
		super(100);
System.out.println("C1's constructor "+ c); }
}

public class TestingInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C2 ca =new C2(10);
	}

}
