package java_package;

public class DisplayProfile extends StudentProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayProfile obj = new DisplayProfile();
		obj.studLoginDetails();
		obj.studProfile();
	}

	@Override
	void studLoginDetails() {
		// TODO Auto-generated method stub
		System.out.println("The username is "+ "Vandan12");
		System.out.println("the password is "+"1234");
	}


}

abstract class StudentProfile
{
	
	 void studProfile()
	{
			String name = "Vadna";
			String deg= "Software Tester";
			System.out.println("The name of the user "+name);
			System.out.println("The designation of the user is "+deg);
		}
	
	abstract void studLoginDetails();
	
}