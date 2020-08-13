package EncapAndAbstracAssign;
class Authd{
	protected String name,email;
	protected char gender;
	public Authd(String name,String email,char gender)
	{
		//super();
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return (name + " " + gender  + "  " + email);
	}
}
	
	class Book {
private String name;
private Authd authd;
private double price;
private int qtyInStock=0;

public Book(String name ,Authd authd ,double price)
{
	this.authd = authd;
	this.name=name;
	this.price=price;
}

public Book(String name,Authd authd,double price,int qtyInStock )

{
	//super(name, getEmail(), getGender());
	this.name=name;
	this.authd =authd;
	this.price =price;
	this.qtyInStock = qtyInStock;
	
	
}

public String getName() {
	return name;
}

public Authd getAuthd() {
	return authd;
}

public double getPrice()
{
     return price;
}

public int getQtyInStock()
{
     return qtyInStock;
}


public void setPrice(double price)
{
     this.price = price;
}

public void setQtyInStock(int qtyInStock)
{
     this.qtyInStock = qtyInStock;
}
public String toString()
{
	 return (name +  "  "+authd);
}




		
		
	}



public class Author {

	public static void main(String args[])
	{
		Authd obj = new Authd("Rahul","123@mail.com",'M');
		Book book = new Book("java",obj,199.0,500);
		System.out.print(book);
	}
	
}
