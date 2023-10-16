package language.basics;

public class Fiboseries {

	private int id;
	private String name;
	
	public String getname() {
		return name;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid (int i) {
		id=i;
	}
	
	public void setname (String n) {
		name =n;
	}
	
	public static void main(String[] args) {

		Fiboseries obj = new Fiboseries();
		obj.setid(12);
		obj.setname("hello");
		System.out.println(obj.getname());
		System.out.println(obj.getid());
		
	}

}
