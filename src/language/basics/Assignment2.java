package language.basics;

public class Assignment2 {
	
	static int a = 10;
	static int b = 5;
	static int r = 2;
	
	static void sumOfNumbers() {
		System.out.println(a + b);
		return;
	}
	
	public class Constants {
	public static final float pi = 3.14f;
	}
	
	static void areaOfCircle() {

		System.out.println( Constants.pi * r * r);
		return;
	}
	
	public static void main(String[] args) {

		Assignment2.sumOfNumbers();
		Assignment2.areaOfCircle();
		
	}

}
