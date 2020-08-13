package EncapandInterface;
class Point1{
	
	private int x;
	private int y;
	public void setX(int x) {
		this.x=(x>79?79:(x<0?0:x));}
	public void setY(int y)
	{
		this.y=(y>24?24:(y<0?0:y));}
	int getX() {return x;}
	int getY() {return y;}

}
public class PointDemo11 {
	public static void main(String args[]) {
		
	int a,b;
	 Point1 p1=new Point1();
	 p1.setX(22);
	 p1.setY(44);
	 a = p1.getX();
	 System.out.println(a);
	 b=p1.getY();
	 System.out.println(b);
}
}