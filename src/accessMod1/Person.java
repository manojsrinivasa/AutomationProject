package accessMod1;

public class Person {

	private String name = "Manoj";
	private int age = 27;
	private String email = "ksmanoj789@gmail.com";
	
	
	public String refname() {
	return name;
	}
	
	public int refage() {
	return age;
	}
	
	public String refemail() {
	return email;
	}

	public static void main(String[] args) {

		Person obj = new Person ();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.email);
		
	}

}
