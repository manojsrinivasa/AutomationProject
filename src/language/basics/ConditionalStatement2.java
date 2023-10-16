package language.basics;

public class ConditionalStatement2 {

	public static void main(String[] args) {

		int percentage = 97;
		
		if (percentage >=90 && percentage <=100) {
			System.out.println("Grade A");
		}
		
		else if (percentage >=80 && percentage <=89) {
			System.out.println("Grade B");
		}
		
		else if (percentage >=70 && percentage <=79) {
			System.out.println("Grade c");
		}
		
		else if (percentage >=60 && percentage <=69) {
			System.out.println("Grade D");
		}
		
		else if (percentage <=60) {
			System.out.println("Grade F");
		}

	}

}
