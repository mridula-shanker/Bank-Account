/**
 * 
 * @author mshanker22
 *
 */
public class BankAccount 
{
	private String name;
	private int  accNum;
	private double balance;
	
	public BankAccount(String n, int aN)
	{
		name=n;
		accNum=aN;
		balance=0;
		
	}
	public BankAccount(String n, int aN, double bal)
	{
		name=n;
		accNum=aN;
		balance=bal;	
	}
	public void deposit(double amt)
	{
		balance=balance+amt;
	}
	public void withdraw(double amt)
	{
		balance=balance-amt;
	}	
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		String temp = "Client name is " + name + " account number is " + accNum + " Balance is " + balance;
		return temp;
	}
}
