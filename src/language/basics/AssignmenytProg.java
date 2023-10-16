package language.basics;

public class AssignmenytProg {

	public static void main(String[] args) {

		double[] temparature = { 98.3, 99.2, 99.9, 102, 101, 98.5, 98.3 };
		double threshold = 100.0;

		for (double temp : temparature) {

			if (temp > threshold) {

				System.out.println("temperature exceeded");
			}

			else {
				System.out.println("temperature not exceeded");
			}
		}


		double sum =0;
		double average= 0;
		for (double temp1 :temparature) {
			sum = sum + temp1; 
		}
		System.out.println("Sum of temprature "+ sum);
		
		average = sum/7;
		System.out.println("Average "+ average);
		
		
		
	}

}
