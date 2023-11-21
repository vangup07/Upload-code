package java_package;

public class BankSystem {
	
	BankSystem(String username,String password)
	{
		System.out.println("The username and password "+username + " "+password);
	}
	
	int amt =1000;
	
	void deposit(int depamt,int a)
	{
		
		 amt=amt+depamt+a;
		System.out.println("This is deposit secttion"+amt);
	}
	
	void withdraw(int b)
	{
		amt=amt -b;
		System.out.println("This is a withdraw section"+amt);
	}
	
	String display()
	{
		return "Vadna";
	}

	public static void main(String[] args) {
		// Create a object 
		 
		BankSystem obj= new BankSystem("vadna12","1234");
		
		obj.deposit(1000,2000);
		obj.withdraw(500);
		System.out.println(obj.display());

	}

}
