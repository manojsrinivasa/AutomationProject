package language.basics;

public class DataType {

	public static void main(String[] args) {
		
		
		float temparature = 25.5f;
		boolean customer = true;
		int phoneNumber = 123456789;
		float amount = 1000.50f;
		String email = "john.doe@example.com";
		double lalitude = 37.7749d;
		double longitude = -122.419400d;
		boolean persorMaritalStatus = true;
		String personOccupation = "Software Engineer";
		String personFavouriteColour= "Blue";
		int currentYear = 2023;
		int socialMediaPlatform = 100000;
		float ratingOfAMovie = 7.5f; 
		char PersonBloodType= 'A';
		String titleOfABook = "To Kill a Mockingbird";
		int numberOfEmployeesInCompany = 500 ;
		String timeOfAnEvent = "2:30 PM" ;
		String nameOfACountry = "United States"; 
		String personEyeColor = "Brown"; 
		String personBirthplace= "New York City"; 
		float distanceBetweenTwoCities = 200.5f;
		
		//Arrays 1D
		
		int [] element= new int [5];
		element[0]= 4;
		element[1]= 7;
		element[2]= 2;
		element[3]= 9;
		element[4]= 5;
		System.out.println(element[2]);
		
		
		String [] favoriteColors = new String [3];
		favoriteColors[0]= "red";
		favoriteColors[1]= "Green";
		favoriteColors[2]= "Blue";
		System.out.println(favoriteColors[2]);
		
		
		// 2D Array
		
		
		int [][] twoDArray = new int [3][3];
		twoDArray[0][0]= 1; 
		twoDArray[0][1]= 2; 
		twoDArray[0][2]= 3; 
		
		twoDArray[1][0]= 4; 
		twoDArray[1][1]= 5; 
		twoDArray[1][2]= 6; 
		
		twoDArray[2][0]= 7; 
		twoDArray[2][1]= 8; 
		twoDArray[2][2]= 9; 
		System.out.println(twoDArray[1][2]);
		
		
		String [][]food = new String [2][2];
		food [0][0]= "pizza";
		food [0][1]= "pasta";
		
		food [1][0]= "burgar";
		food [1][1]= "fries";
		
		System.out.println(food[1][1]);
		
		
		
		

	}

}
