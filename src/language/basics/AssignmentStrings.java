package language.basics;

public class AssignmentStrings {


public static void main(String[] args) {
	
	int a = 153;
	int rem;
	int sum=0;
	while (a>0) {
		rem= a % 10;
		rem = rem * 3;
		sum += rem;
		a= a/10;
		System.out.println(sum);
		
	}



	    
    }
}
