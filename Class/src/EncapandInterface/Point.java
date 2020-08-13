package EncapandInterface;

//public class Point {
//int x;
//int y;
//void setX(int x) {
//	x=(x>79?79:(x<0?0:x));}
//void setY(int y)
//{
//	y=(y>24?24:(y<0?0:y));}
//int getX() {return x;}
//int getY() {return y;}
//}
 class PointDemo {
private int x;
private int y;
public void setX(int x) {
	x=(x>79?79:(x<0?0:x));}
public void setY(int y)
{
	y=(y>24?24:(y<0?0:y));}
int getX() {return x;}
int getY() {return y;}
}
public class Point{
	 public static void main(String args[]) {
		 int a,b;
		 PointDemo p1=new PointDemo();
		 p1.setX(22);
		 p1.setY(44);
		 a = p1.getX();
		 System.out.print(a);
		 b=p1.getY();
		 System.out.print(b);
	 }
 }

