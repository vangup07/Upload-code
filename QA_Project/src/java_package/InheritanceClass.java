package java_package;

public class InheritanceClass {
	
	void add()
	{
		int a = 10;
		int b=20; 
		
		int sum =a +b;
		System.out.println(sum);
	}
	
	void add(int a)
	{
		int sum =20+a;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceClass obj= new InheritanceClass();
		// metod overloading
		obj.add();
		obj.add(20);
		
		
		Student obj1= new Student();
		obj1.studName();
		obj1.universityName();
		obj1.department();
		obj1.studName();
		obj1.adddetails();
		obj1.payment();
		// method overriding 
		obj1.loginAccess();
		
	}

}



class University 
{
	
	void universityName()
	{
		System.out.println("The name of university Harvad");
	}
	
	void department()
	{
		System.out.println("The department is IT");
	}

	 void loginAccess()
	{
		System.out.println("This is the login access of university");
	}
	
}

class Student extends University implements RegistartionProcess
{
	void studName()
	{
		System.out.println("The name of student Vadna");
	}

	@Override
	public void formfill() {
		// TODO Auto-generated method stub
	System.out.println("The form ");	
	}

	@Override
	public void adddetails() {
		// TODO Auto-generated method stub
		System.out.println("Add details of student");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment details ");
	}
	void loginAccess()
	{
	System.out.println("The loginAcess of student ");	
	}
	
}
