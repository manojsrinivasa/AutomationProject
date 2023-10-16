package language.basics;

import java.util.Scanner;

//import java.util.Scanner;

public class TestProg {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int count =0;
		while (n > 1) {
			int temp = (n % 10)  ; 
			if (temp == 7) {
			 count ++;
			}
			n= n/10;
		}
		System.out.println(count);


		
		}	
}


