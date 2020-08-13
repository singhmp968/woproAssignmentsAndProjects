package exapmple;
 class Figure
{
	double dimension1;
	double dimension2;
Figure(double x,double y){
    dimension1=x;dimension2=y;}
double area(){
        System.out.println("AreaofFigureisundefined");
        return 0;}
    
}

class Rectangle extends Figure{
    Rectangle(double x,double y){
        super(x,y);}
        double area() //method overriding 
        
        {//super.area();
        	System.out.print("Area of rectangle is :");
        return dimension1 * dimension2;}
    
}class Triangle extends Figure {
    Triangle(double x, double y) {
        super(x,y);}
        double area()//method overriding 
        {System.out.print("Area for triangle is :");
        return dimension1 * dimension2 / 2;}
    
}

public class FindArea {
	public static void main(String args[]) {
		Figure f=new Figure(10,10);
	 Rectangle r=new Rectangle(9,5);
	 Triangle t=new Triangle(10,8);
	    Figure fig ;//referencevariable
	    fig=r;
	    System.out.println("Areaofrectangleis:"+fig.area());
	    fig=t;
	    System.out.println("Areaoftriangleis:"+fig.area());
	    fig=f;
	    System.out.println(fig.area());}
	    
}
