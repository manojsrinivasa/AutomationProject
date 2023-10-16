package language.basics;

public class ConditionalStatment {

	public static void main(String[] args) {

		int age = 39;
		
		if (age >=0 && age <=12) {
			System.out.println("Child");
		}
		
		else if (age >=13 &&age <=19) {
			System.out.println("Teenager");
		}
		
		else if (age >=20 && age <=39) {
			System.out.println("Young adult");
		}
		
		else if (age >=40 && age <=59) {
			System.out.println("Middle-aged adult");
		}
		else {
			System.out.println("Senior citizen");
		}
		
		
		
		

	}

}
