package java_package;

public class BankClass {
public	int amt =1000;
private 	void deposit(int depamt,int a)
	{
		
		 amt=amt+depamt+a;
		System.out.println("This is deposit secttion"+amt);
	}

	public static void main(String[] args) {
		// Create an object
		 BankClass obj = new BankClass();
	}

}
