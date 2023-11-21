package java_package;

public class EncapsulateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile obj= new Profile();
		obj.setAge(11);
		obj.setNaem("Vadna");
		obj.setId("1012");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}


class Profile
{
private String name;
private String idNum;
private int age;

	void setAge(int newAge)
	{
		age=newAge;
	}
	

	void setNaem(String newName)
	{
		name=newName;
	}
	

	void setId(String newId)
	{
		idNum=newId;
	}

	int getAge()
	{
	
		return age;
	}
	String getName()
	{
		return name;
	}
	
	String getId()
	{
		return idNum;
	}
	
}