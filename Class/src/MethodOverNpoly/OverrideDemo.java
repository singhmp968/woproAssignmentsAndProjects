package MethodOverNpoly;
public class a {
	int a,b;
	a(int m, int n){
	    a = m;b = n;}
	void display(){
	    System.out.println("a and b are :" + a +" " + b);}
}
class B extends a{
    int c;B(int m, int n, int o)
    {super(m,n); 
    c = o;
    }
    void display() {
        System.out.println("c :" + c);}
    
}
public class OverrideDemo {
	public static void main(String args[]){
	    B subOb= new B(4,5,6);
	subOb.display(); }
}

