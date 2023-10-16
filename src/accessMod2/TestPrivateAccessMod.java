package accessMod2;

import accessMod1.Person;

public class TestPrivateAccessMod extends Person{

	public static void main(String[] args) {
		TestPrivateAccessMod obj = new TestPrivateAccessMod();
		System.out.println(obj.refname());
		System.out.println(obj.refage());
		System.out.println(obj.refemail());
		
	}

}
