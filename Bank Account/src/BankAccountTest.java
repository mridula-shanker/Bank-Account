/**
 * 
 * @author mshanker22
 *
 */
public class BankAccountTest {

	public static void main(String[] args) 
	{
		BankAccount person1 =  new BankAccount("Mridula",9999);
		BankAccount person2 =  new BankAccount("Shruthi",8888,100);	
		System.out.println(person1.getBalance());
		System.out.println(person2.getBalance());
		person1.deposit(1000);
		person2.deposit(100);
		System.out.println(person1.getBalance());
		System.out.println(person2.getBalance());
		person1.withdraw(1000);
		person2.withdraw(100);	
		System.out.println(person1.getBalance());
		System.out.println(person2.getBalance());
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
	}

}
