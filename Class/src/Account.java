
public class Account {
class acc{
	double balance;
public void deposit(double amt)
{
	balance +=amt;
}
public double withdrawl(double amt)
{
	int minbal = 5000;
	if(balance >=(amt+minbal)) {
		balance-=amt;
		return amt;
	} else {
		System.out.print("innsuff bal");
				return 0.0;
	}
	
}
	public double getbal()
	{
		return balance;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
